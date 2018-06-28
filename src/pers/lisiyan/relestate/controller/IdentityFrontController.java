package pers.lisiyan.relestate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import Util.LogUtil;
import pers.lisiyan.relestate.model.IdentityModel;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IIdentityService;

@Controller("identityFrontController")
public class IdentityFrontController implements IFrontController{

	
	private IdentityModel identityModel;
	
	private IIdentityService identityService;
	
	private List<IdentityModel> identityModels;

	public IIdentityService getIdentityService() {
		return identityService;
	}

	@Autowired
	public void setIdentityService(IIdentityService identityService) {
		this.identityService = identityService;
	}


	public List<IdentityModel> getIdentityModels() {
		return identityModels;
	}

	public void setIdentityModels(List<IdentityModel> identityModels) {
		this.identityModels = identityModels;
	}
	
	

	public IdentityModel getIdentityModel() {
		return identityModel;
	}

	public void setIdentityModel(IdentityModel identityModel) {
		this.identityModel = identityModel;
	}

	@Override
	public String tomain() throws Exception {
		// TODO Auto-generated method stub
		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");
		identityModels = identityService.getIdentityByUserID(userModel.getUser_id());
		System.out.println(getClass().getSimpleName()+"tomain");
		return "tomain";
	}

	@Override
	public String toshow() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String tomessage() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toadd() throws Exception {

		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");
		identityModel = new IdentityModel();
		identityModel.setUser_id(userModel.getUser_id());  
		
		return "toadd";

	}
	
	
	
	
}
