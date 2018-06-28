package pers.lisiyan.relestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IUserService;

@Controller("userProcessController")
public class UserProcessController extends ActionSupport{

	private IUserService iUserService;
	
	private UserModel userModel;
	
	private String user_email;
	
	private String user_password;
	
	private String user_tel;




	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	public IUserService getiUserService() {
		return iUserService;
	}

	

	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	public String add() throws Exception {
		System.out.println("hello");
		userModel = new UserModel();
		userModel.setUser_email(user_email);
		userModel.setUser_password(user_password);
		userModel.setUser_tel(user_tel);
		
		iUserService.addUser(userModel);

		return SUCCESS;
	}
	

}
