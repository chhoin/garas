package com.smart.garas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.smart.garas.dto.SecUserDto;
import com.smart.garas.dto.SecUserLogin;
import com.smart.garas.service.SecUserService;
@Controller
@SessionAttributes("user1")
public class SecUserController {

  @Autowired
  private SecUserService studentService;

  @RequestMapping(value="/api/signup1", method=RequestMethod.GET)
  public String signup(Model model) {
      SecUserDto student = new SecUserDto();
      model.addAttribute("user", student);
      return "user";
  }

  @RequestMapping(value="/api/signup1", method=RequestMethod.POST)
  public String signup(@ModelAttribute("user1") SecUserDto secUserDto, Model model) {
      if(studentService.getStudentByUserName(secUserDto.getSec_usr_name())) {
          model.addAttribute("message", "User Name exists. Try another user name");
          return "user";
      } else {  	  
          studentService.insertStudent(secUserDto);
          model.addAttribute("message", "Saved student details");
          return "redirect:login.html";
      }
  }
/**
 * 
 * @param model
 * @return
 */
  @RequestMapping(value="/login", method=RequestMethod.GET)
  public String login(Model model) {
	  SecUserLogin studentLogin = new SecUserLogin();
      model.addAttribute("studentLogin", studentLogin);
      return "login";
  }

  @RequestMapping(value="/login", method=RequestMethod.POST)
  public String login(@ModelAttribute("studentLogin") SecUserLogin studentLogin) {
      boolean found = studentService.getStudentByLogin(studentLogin.getUserName(), studentLogin.getPassword());
/*	  	if(studentLogin != null && studentLogin.getUserName().equals("abc") && studentLogin.getPassword().equals("123")){
			found = true;
		}*/
      if (found) {     
    	  List<String> logIn = new ArrayList<String>();
    	  logIn.add("success");
    	  logIn.add("capturelist");

    		//  return logIn;
    	 return "capturelist";
      } else {                
          return null;//"failure";
      }
  }
	
	
}
