package pers.lisiyan.relestate.controller;

import java.sql.SQLException;
import java.util.Map;
import java.util.zip.ZipEntry;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.omg.CORBA.Request;
import org.omg.PortableServer.ServantActivator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import pers.lisiyan.relestate.exception.TestException;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IUserService;

@Controller("userLoginController")
public class UserLoginController extends ActionSupport {

	private IUserService iUserService;

	private int id;

	private String password;
	

	public IUserService getiUserService() {
		return iUserService;
	}

	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() throws Exception {

	
		if (id==2) {
			
			System.out.println("2");
//			throw new NullPointerException();
		
		}
		
		
		
		System.out.println("login check");
		
		if (iUserService.validate(id, password)) {

			UserModel userModel = new UserModel();
			userModel.setUser_id(id);
			// 非耦合方式
			ActionContext ac = ActionContext.getContext();
			Map<String, Object> session = ac.getSession();
			System.out.println("login check");
			session.put("um", userModel);


			return "success";
		}
		

		return "failure";

	}
	
	public void validate(){
		
		
		if (id==1001) {
			addFieldError("id","你不行");
		}
		
	}

}
