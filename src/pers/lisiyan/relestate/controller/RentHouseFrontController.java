package pers.lisiyan.relestate.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Util.LogUtil;
import pers.lisiyan.relestate.model.RentHouseModel;
import pers.lisiyan.relestate.service.IRentHouseService;
import pers.lisiyan.relestate.service.ISellHouseService;

@Controller("rentHouseFrontController")
public class RentHouseFrontController implements IFrontController {
	
	private IRentHouseService iRentHouseService;
	
	private RentHouseModel rentHouseModel;
	
	private List<RentHouseModel> rentHouseModels;
	
	private String r_house_address;
	
	private String r_house_size;
	
	private String r_house_price;
	
	private String r_house_floor;
	
	private File photo;
	
	private String photoFileName;
	
	private String photoContentType;
	
	private String r_house_note;
	
	 private int r_house_id;

	@Autowired
	public void setiRentHouseService(IRentHouseService iRentHouseService) {
		this.iRentHouseService = iRentHouseService;
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



	public void setR_house_address(String r_house_address) {
		this.r_house_address = r_house_address;
	}



	public void setR_house_size(String r_house_size) {
		this.r_house_size = r_house_size;
	}



	public void setR_house_price(String r_house_price) {
		this.r_house_price = r_house_price;
	}



	public List<RentHouseModel> getRentHouseModels() {
		return rentHouseModels;
	}



	public void setRentHouseModels(List<RentHouseModel> rentHouseModels) {
		this.rentHouseModels = rentHouseModels;
	}



	public IRentHouseService getiRentHouseService() {
		return iRentHouseService;
	}



	public RentHouseModel getRentHouseModel() {
		return rentHouseModel;
	}



	public String getR_house_address() {
		return r_house_address;
	}



	public String getR_house_size() {
		return r_house_size;
	}



	public String getR_house_price() {
		return r_house_price;
	}



	public String getR_house_floor() {
		return r_house_floor;
	}



	public File getPhoto() {
		return photo;
	}



	public String getPhotoFileName() {
		return photoFileName;
	}



	public String getPhotoContentType() {
		return photoContentType;
	}



	public String getR_house_note() {
		return r_house_note;
	}



	public void setR_house_floor(String r_house_floor) {
		this.r_house_floor = r_house_floor;
	}



	public void setPhoto(File photo) {
		this.photo = photo;
	}



	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}



	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}



	public void setR_house_note(String r_house_note) {
		this.r_house_note = r_house_note;
	}



	@Override
	public String tomain() throws Exception {
		// TODO Auto-generated method stub
		LogUtil.println(RentHouseFrontController.class,"tomain()");
		
		return "tomain";
	}



	@Override
	public String toshow() throws Exception {
		// TODO Auto-generated method stub
		  
		   rentHouseModels = iRentHouseService.getListByAll();
		   
		   LogUtil.println(RentHouseFrontController.class,"toshow()");
		   
		   return "toshow";
	}



	@Override
	public String tomessage() throws Exception {
		// TODO Auto-generated method stub
		
		rentHouseModel = iRentHouseService.getQueryById(r_house_id);
	
		return "tomessage";
	}




	

	

}
