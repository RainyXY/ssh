package pers.lisiyan.relestate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import Util.LogUtil;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IContractService;
import pers.lisiyan.relestate.service.IUserService;

@Controller("userFrontController")
public class UserFrontController {

	private String read;

	private IUserService iUserService;

	private List<UserModel> userlist;

	private String result;

	public List<UserModel> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<UserModel> userlist) {
		this.userlist = userlist;
	}

	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	public String getRead() {
		return read;
	}

	public void setRead(String read) {
		this.read = read;
	}

	public IUserService getiUserService() {
		return iUserService;
	}

	public String toadd() throws Exception {

		LogUtil.println(UserFrontController.class, "toadd()");

		return "toadd";

	}

	public String tomain() throws Exception {

		LogUtil.println(UserFrontController.class, "tomain()");

		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");

		if (userModel != null) {
			result = "success";
			System.out.println(result);
		}

		return "tomain";

	}

	public String tochecklog() throws Exception {

		return "tocheck";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String todispatch() throws Exception {

		switch (read) {

		case "登录":

			return tochecklog();

		case "注册":

			return toadd();

		}

		return tomain();

	}

}
