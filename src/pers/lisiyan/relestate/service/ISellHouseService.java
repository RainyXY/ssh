package pers.lisiyan.relestate.service;

import java.io.File;
import java.util.List;

import pers.lisiyan.relestate.model.SellHouseModel;
import pers.lisiyan.relestate.model.UserModel;

public interface ISellHouseService {
	
	
	public void add(SellHouseModel sellHouseModel,File photo) throws Exception;
	
	public void add(SellHouseModel sellHouseModel,File photo,int userId) throws Exception;

	public List<SellHouseModel> getListByAll() throws Exception;
	
	public List<SellHouseModel> getListBySearchWithPage(int rows,int page) throws Exception;
	
	public SellHouseModel getQueryById(int id) throws Exception;
	
	public void modify(SellHouseModel sellHouseModel) throws Exception;
	
	public void delete(SellHouseModel sellHouseModel) throws Exception;
	
	public int getPageCountBySearch(int rows) throws Exception;
	
	public int getCountBySearch() throws Exception;
}
