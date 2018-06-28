package pers.lisiyan.relestate.service;

import java.util.List;

import pers.lisiyan.relestate.model.ContractModel;
import pers.lisiyan.relestate.model.UserModel;

public interface IUserService {

	public void addUser(UserModel userModel) throws Exception;
	
	public void usertoContract(int userid,int contractid) throws Exception;
	
	public List<UserModel> getListByAll() throws Exception;
	
	public void modify(UserModel userModel) throws Exception;
	
	public void delete(UserModel userModel) throws Exception;
	
	public boolean validate(int id,String password) throws Exception;
	
	public List<ContractModel> getUserBuyList(int userid,int contractid) throws Exception;
	
	public UserModel getUserById(int id) throws Exception;
	
}
