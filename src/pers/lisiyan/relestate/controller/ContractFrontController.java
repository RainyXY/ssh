package pers.lisiyan.relestate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import Util.LogUtil;
import pers.lisiyan.relestate.model.ContractModel;
import pers.lisiyan.relestate.model.SellHouseModel;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IContractService;
import pers.lisiyan.relestate.service.ISellHouseService;
import pers.lisiyan.relestate.service.IUserService;

@Controller("contractFrontController")
public class ContractFrontController implements IFrontController{
	
	private IContractService iContractService;
	
	private ISellHouseService iSellHouseService;
	
	private List<ContractModel> contractModels;
	
	private List<Integer> contractIds;
	
	private int s_house_id;
	
	private int userId;
	
	private int sellUserId;
	

	
	public List<Integer> getContractIds() {
		return contractIds;
	}

	public void setContractIds(List<Integer> contractIds) {
		this.contractIds = contractIds;
	}


	public int getSellUserId() {
		return sellUserId;
	}

	public void setSellUserId(int sellUserId) {
		this.sellUserId = sellUserId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public IContractService getiContractService() {
		return iContractService;
	}

	
	
	public List<ContractModel> getContractModels() {
		return contractModels;
	}

	public void setContractModels(List<ContractModel> contractModels) {
		this.contractModels = contractModels;
	}

	@Autowired
	public void setiContractService(IContractService iContractService) {
		this.iContractService = iContractService;
	}

	public int getS_house_id() {
		return s_house_id;
	}

	public void setS_house_id(int s_house_id) {
		this.s_house_id = s_house_id;
	}
	
	

	public ISellHouseService getiSellHouseService() {
		return iSellHouseService;
	}

	@Autowired
	public void setiSellHouseService(ISellHouseService iSellHouseService) {
		this.iSellHouseService = iSellHouseService;
	}


	@Override
	public String tomain() throws Exception {
		// TODO Auto-generated method stub
	
	
		
		return null;
		
	}

	@Override
	public String toshow() throws Exception {
		// TODO Auto-generated method stub
		
		SellHouseModel sellHouseModel = iSellHouseService.getQueryById(s_house_id);
		
		sellUserId = 1;
//		sellUserId = sellHouseModel.getSell_user().getUser_id();
		s_house_id = sellHouseModel.getS_house_id();
		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");
		userId =userModel.getUser_id();	
		return "show";
	}

	@Override
	public String tomessage() throws Exception {
		// TODO Auto-generated method stub
		 	
		System.out.println("----------->");
	
		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");
		
		contractIds = iContractService.getListByUserId(userModel.getUser_id());
		
		contractModels = new ArrayList<>();
			
		for(int id:contractIds){
			
			contractModels.add(iContractService.getQueryById(id));
			
			System.out.println(contractModels.get(0).getUser_id());
		}
		
		
		return "message";
		
	
	}
	
	public String tomodify() throws Exception{
		
		System.out.println("----------->");
		
		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");
		
		contractIds = iContractService.getListByUserId(userModel.getUser_id());
		
		contractModels = new ArrayList<>();
			
		for(int id:contractIds){
			
			contractModels.add(iContractService.getQueryById(id));
			
			System.out.println(contractModels.get(0).getUser_id());
		}
		
		
		return "modify";
		
	}
	
	

}
