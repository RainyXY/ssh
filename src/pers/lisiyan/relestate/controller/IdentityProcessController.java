package pers.lisiyan.relestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import pers.lisiyan.relestate.model.IdentityModel;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IIdentityService;
import pers.lisiyan.relestate.service.IUserService;

@Controller("identityProcessController")
public class IdentityProcessController implements IProcessController {

	private IIdentityService identityService;

	private int i_id;
	private int user_id;

	private IdentityModel identityModel;
	
	private IUserService iUserService;

	public IdentityModel getIdentityModel() {
		return identityModel;
	}

	public void setIdentityModel(IdentityModel identityModel) {
		this.identityModel = identityModel;
	}

	public IIdentityService getIdentityService() {
		return identityService;
	}

	public int getI_id() {
		return i_id;
	}

	public void setI_id(int i_id) {
		this.i_id = i_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	public IUserService getiUserService() {
		return iUserService;
	}

	@Autowired
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	@Autowired
	public void setIdentityService(IIdentityService identityService) {
		this.identityService = identityService;
	}

	@Override
	public String add() throws Exception {
		// TODO Auto-generated method stub

		IdentityModel identityModel = new IdentityModel();
		System.out.println("id" + user_id);
		identityModel.setI_id(i_id);
		identityModel.setUser_id(user_id);
		identityService.add(identityModel);
		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");
		userModel = iUserService.getUserById(userModel.getUser_id());
		userModel.setIdentity(identityModel);
		iUserService.modify(userModel);
		
		return "success";
	}

	@Override
	public String modify() throws Exception {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		IdentityModel identityModel = new IdentityModel();
		identityModel.setI_id(i_id);
		identityService.delete(identityModel);
		return "success";
	}

	@Override
	public String dispatch() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
