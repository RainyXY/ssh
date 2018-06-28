 package pers.lisiyan.relestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pers.lisiyan.relestate.model.ContractModel;
import pers.lisiyan.relestate.service.IContractService;

@Controller("controllerProcessController")
public class ContractProcessController implements IProcessController {
	
	
	private int c_id;
	private int s_house_id;
	private int sellUserId;
	private IContractService iContractService;
	private ContractModel contractModel;
	private int[] userId;


	public int getC_id() {
		return c_id;
	}

	 public void setC_id(int c_id)      {
		this.c_id = c_id;
	}



	public int getS_house_id() {
		return s_house_id;
	}

	public void setS_house_id(int s_house_id) {
		this.s_house_id = s_house_id;
	}

	public int getSellUserId() {
		return sellUserId;
	}

	public void setSellUserId(int sellUserId) {
		this.sellUserId = sellUserId;
	}

	public int[] getUserId() {
		return userId;
	}

	public void setUserId(int[] userId) {
		this.userId = userId;
	}

	public IContractService getiContractService() {
		return iContractService;
	}

	@Autowired
	public void setiContractService(IContractService iContractService) {
		this.iContractService = iContractService;
	}

	public ContractModel getContractModel() {
		return contractModel;
	}

	public void setContractModel(ContractModel contractModel) {
		this.contractModel = contractModel;
	}

	@Override
	public String add() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(""+s_house_id+sellUserId+userId);
		contractModel = new ContractModel();
	    contractModel.setHouse_id(s_house_id);
	    contractModel.setUser_id(sellUserId);
		iContractService.add(contractModel);
		iContractService.add(contractModel.getC_id(),userId);
		return "success";
	}

	@Override
	public String modify() throws Exception {
		// TODO Auto-generated method stub
		
		return "success";
	}

	@Override
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dispatch() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
