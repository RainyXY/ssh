package pers.lisiyan.relestate.service;

import java.util.List;

import pers.lisiyan.relestate.model.ContractModel;
import pers.lisiyan.relestate.model.RentHouseModel;
import pers.lisiyan.relestate.model.SellHouseModel;


public interface IContractService  {
	
	public void add(int c_id,int[] user_ids) throws Exception;
	
	public void add(ContractModel contractModel);

	public List<ContractModel> getListByAll() throws Exception;
	
	public void modify(ContractModel contractModel) throws Exception;
	
	public void delete(ContractModel contractModel) throws Exception;
	
	public ContractModel getQueryById(int id) throws Exception;
	
	public List<Integer> getListByUserId(int id) throws Exception;
	
	public List<Integer> getSellHouse(int id) throws Exception;

}
