package pers.lisiyan.relestate.service;

import java.util.List;

import pers.lisiyan.relestate.model.IdentityModel;

public interface IIdentityService {

	public void add(IdentityModel identityModel) throws Exception;
	
	public void modify() throws Exception;
	
	public void delete(IdentityModel identityModel) throws Exception;
	
	public void view() throws Exception;
	
	public List<IdentityModel> getIdentityByUserID(int id) throws Exception;
	
}
