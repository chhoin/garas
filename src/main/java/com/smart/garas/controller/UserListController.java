package com.smart.garas.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.garas.dto.UserListDto;
import com.smart.garas.service.UserListService;

@Controller
public class UserListController {
	@Autowired
	private UserListService userListService;
	
	// Show user list page
	/*@RequestMapping("/userlist")
	public String getUserListPage(){
		return "userlist";
	}*/
	
	// Get data combo of userName
	@RequestMapping(value="/api/userlistcomboname", method = RequestMethod.GET)
	@ResponseBody
	public List<UserListDto> getComboUserNames(){
		return userListService.getComboUserName();
	}
	
	// Search data by userName
	@RequestMapping(value="/api/userlists/{userCode}", method = RequestMethod.GET)
	@ResponseBody
	public List<UserListDto> getSearchUserByNames(@PathVariable String userCode){
		return userListService.getSearchUserByName(userCode);
	}
	
	// Delete data by  userName
	@RequestMapping(value="/api/userlistsdelete/{userCode}", method = RequestMethod.DELETE)
	@ResponseBody
	public Integer deleteByIds(@PathVariable String userCode){
		return userListService.deleteById(userCode);
	}
	
	// Update data by userName
	@RequestMapping(value="/api/userlists/{userCode}", method = RequestMethod.PUT)
	@ResponseBody
	public Integer editById(@RequestBody UserListDto userListDto, @PathVariable String userCode){
		userListDto.setUserName(userCode);
		return userListService.editById(userListDto);
	}
	
}
