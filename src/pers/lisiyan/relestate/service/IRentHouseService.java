package pers.lisiyan.relestate.service;

import java.io.File;
import java.util.List;

import pers.lisiyan.relestate.model.RentHouseModel;
import pers.lisiyan.relestate.model.SellHouseModel;
import pers.lisiyan.relestate.model.UserModel;


public interface IRentHouseService {
	
	
	public void add(RentHouseModel rentHouseModel,File photo) throws Exception;
	
	public void add(RentHouseModel rentHouseModel,File photo,int userId) throws Exception;

	public List<RentHouseModel> getListByAll() throws Exception;

	public List<RentHouseModel> getListBySearchWithPage() throws Exception;
	
	public RentHouseModel getQueryById(int id) throws Exception;
	
	public void modify(RentHouseModel rentHouseModel) throws Exception;
	
	public void delete(RentHouseModel rentHouseModel) throws Exception;
}
