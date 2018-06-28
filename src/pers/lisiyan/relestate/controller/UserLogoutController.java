package pers.lisiyan.relestate.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import pers.lisiyan.relestate.model.UserModel;

@Controller("userLogoutController")
public class UserLogoutController {

	
	
	public String logout() throws Exception{
		
		ActionContext ac = ActionContext.getContext();
		Map<String, Object> session = ac.getSession();
		System.out.println("login check");
		session.put("um", null);
		
		
		return "success";
	}
	
}
