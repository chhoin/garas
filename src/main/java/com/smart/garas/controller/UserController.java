package com.smart.garas.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.garas.dto.Pagination;
import com.smart.garas.dto.ResponseMessage;
import com.smart.garas.dto.SubMenuDto;
import com.smart.garas.dto.UserDataDto;
import com.smart.garas.dto.UserDto;
import com.smart.garas.service.UserService;



@Controller
public class UserController {
	
	private static Logger logger = Logger.getLogger( UserController.class );
	
	@Autowired
	private UserService userService;
	
	// Show user page
	@RequestMapping("/user")
	public String getUserPage(){
		return "userlist";
	}
	
	/**
	 * search
	 * @param pageId
	 * @param itemId
	 * @return
	 */
	@RequestMapping(value = "/userlist/{pageId}/{itemId}/{key}", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public ResponseMessage list(@PathVariable("pageId") String pageId, @PathVariable("itemId") String itemId, @PathVariable("key") String key) {
		
		Pagination pagination = new Pagination();
		ArrayList<UserDto> users = new ArrayList<UserDto>();
		
		try {
			pagination.setItem(Double.valueOf(itemId.replaceAll("[^0-9]", "")));
			pagination.setPage(Long.valueOf(pageId.replaceAll("[^0-9]", "")));
			pagination.setTotalRecord(userService.countSearch(key).doubleValue());
			pagination.setKeySearch(key);

			users = userService.list(pagination);

			if (users != null && !users.isEmpty()) {
				return new ResponseMessage(true, users, pagination);
			} else {
				return new ResponseMessage(false, null);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return new ResponseMessage(false, "404", "ERROR OCCURRING!");
	}
	
	/**
	 * deletePhone
	 * @param id
	 * @return
	 */
	@RequestMapping( value="user/delete/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseMessage deletePhone(@PathVariable("id") String id){
		try{
			
			if (userService.delete( id )) {
				
				return new ResponseMessage( true );
				
			} else {
				
				return new ResponseMessage( false );
			}
			
		}catch(Exception e){
			logger.error(e.getMessage(), e);
		}
		return new ResponseMessage(false, "404", "ERROR OCCURRING!");
	}
	
	// Show user page
	@RequestMapping("/userForm")
	public String getUserFormPage(ModelMap modelMap){
		
		modelMap.addAttribute("title"		,	"Add User" )
				 .addAttribute("message"	,	"")
				 .addAttribute("action"		,	"store")
				 .addAttribute("menu"		,	userService.listSubMenu())
				 .addAttribute("edit"		,	false)
				 .addAttribute("user"		,	new UserDataDto() );
		
		return "userForm";
	}
	
	
	/**
	 * store
	 * @param image
	 * @param m
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping(value={"/user/store"}, method = RequestMethod.POST)
	public String store( ModelMap m, UserDataDto user, HttpServletRequest request) {
		
		try {
			String userCode = "USER-"+userService.lastUserCode();
			
			user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
			user.setUsercode(userCode);
			
			//First insert user information
			boolean insertUser = userService.store(user);
			
			//Second insert user role
			boolean insertUserRole = userService.storeUserRole(userCode);
			
			//Third insert user assign menu
			ArrayList<SubMenuDto> menuList = userService.listSubMenu();
			for (SubMenuDto subMenuDto : menuList) {
				userService.storeUserAssMenu(subMenuDto.getMenuId().toString(), userCode);
			}
			boolean insertUserAssMenu = userService.updateUserAssMenu(user.getSubMenu(), userCode);
					
			if (insertUser && insertUserRole && insertUserAssMenu ) {
				m.addAttribute("title"		,	"Add User" )
				 .addAttribute("message"	,	"<div class='alert alert-success'> <a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a><strong>Insert Success</strong>. </div>")
				 .addAttribute("action"		,	"store")
				 .addAttribute("menu"		,	userService.listSubMenu())
				 .addAttribute("edit"		,	false)
				 .addAttribute("user"		,	new UserDto());
				
			} else {
				user.setPassword("");
				m.addAttribute("title"		,	"Add User" )
				.addAttribute("message"		,	"<div class='alert alert-danger'> <a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a><strong>Insert Fail!</strong>. </div>")
				 .addAttribute("action"		,	"store")
				 .addAttribute("menu"		,	userService.listSubMenu())
				 .addAttribute("edit"		,	false)
				 .addAttribute("user"		, 	user);
			}
		} catch (Exception e) {
			user.setPassword("");
			m.addAttribute("title"		,	"Add User" )
			.addAttribute("message"		,	"<div class='alert alert-danger'> <a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a><strong>Insert Fail!</strong>. </div>")
			 .addAttribute("action"		,	"store")
			 .addAttribute("menu"		,	userService.listSubMenu())
			 .addAttribute("edit"		,	false)
			 .addAttribute("user"		, 	user);
			logger.error(e.getMessage(), e);
		}
		return "userForm";
	}
	
	/**
	 * edit
	 * @param modelMap
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public String edit(ModelMap modelMap, @PathVariable("id") String id) {
		try {
			
			modelMap.addAttribute("title"		,	"Update User" )
					 .addAttribute("message"	,	"")
					 .addAttribute("action"		,	"update")
					 .addAttribute("edit"		,	true)
					 .addAttribute("user"		,	userService.detail(id));
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return "userForm";
	}
	
	/**
	 * update
	 * @param image
	 * @param m
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping(value={"/user/update"}, method = RequestMethod.POST)
	public String update(ModelMap model, UserDto user, HttpServletRequest request) {
		try {
			
			
			if (userService.update(user)) {
				model.addAttribute("title"		,	"Update User" )
					 .addAttribute("message"	,	"<div class='alert alert-success'> <a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a><strong>Update Success</strong>. </div>")
					 .addAttribute("action"		,	"update")
					 .addAttribute("edit"		,	true)
					 .addAttribute("user"		,	userService.detail(user.getUserCode()));
					 
			}else {
				model.addAttribute("title"		,	"Update User" )
					 .addAttribute("message"	,	"<div class='alert alert-danger'> <a href='#' class='close' data-dismiss='alert' aria-label='close'>&times;</a><strong>Update Fail!</strong>. </div>")
					 .addAttribute("action"		,	"update")
					 .addAttribute("edit"		,	true)
					 .addAttribute("user"		,	userService.detail(user.getUserCode()));
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return "userForm";
	}
	
	/*// Check duplicate data
	@RequestMapping(value="/api/users/existId", method = RequestMethod.GET)
	@ResponseBody
	public boolean checkDuplicatData(@RequestParam String userName){
		return userService.countById(userName) != 0;
	}
	
	// Save data into database
	@RequestMapping(value="/api/users", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody UserDto userDto){
		return userService.save(userDto);
	}*/

}
