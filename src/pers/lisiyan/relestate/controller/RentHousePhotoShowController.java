package pers.lisiyan.relestate.controller;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pers.lisiyan.relestate.model.RentHouseModel;
import pers.lisiyan.relestate.service.IRentHouseService;
import pers.lisiyan.relestate.service.ISellHouseService;

@Controller("rentHousePhotoShowController")
public class RentHousePhotoShowController {

	private IRentHouseService iRentHouseService;
	
	private RentHouseModel rentHouseModel;
	
	private int r_house_id;

	public IRentHouseService getiRentHouseService() {
		return iRentHouseService;
	}

	@Autowired
	public void setiRentHouseService(IRentHouseService iRentHouseService) {
		this.iRentHouseService = iRentHouseService;
	}

	public RentHouseModel getRentHouseModel() {
		return rentHouseModel;
	}

	public void setRentHouseModel(RentHouseModel rentHouseModel) {
		this.rentHouseModel = rentHouseModel;
	}


	
	public int getR_house_id() {
		return r_house_id;
	}

	public void setR_house_id(int r_house_id) {
		this.r_house_id = r_house_id;
	}

	public InputStream getInputStream() throws Exception{
		
		InputStream result=null;
		
		System.out.println("id="+r_house_id);
	
		
		rentHouseModel = iRentHouseService.getQueryById(r_house_id);
		if (rentHouseModel != null && rentHouseModel.getFilename() != null) {
		
			result = rentHouseModel.getR_house_picture().getBinaryStream();
			
		}else {
			rentHouseModel = iRentHouseService.getQueryById(1);
			result = rentHouseModel.getR_house_picture().getBinaryStream();
		}
		
		return result;
	}
	
	public String show() throws Exception{
		
		return "success";
	}
	

	
}
