package pers.lisiyan.relestate.controller;

import java.io.File;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import Util.LogUtil;
import pers.lisiyan.relestate.model.SellHouseModel;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.ISellHouseService;


@Controller("sellHouseProcessController")
public class SellHouseProcessController implements IProcessController{
	
	private SellHouseModel sellHouseModel;

	private ISellHouseService iSellHouseService;
	
	private String s_house_address;
	private String s_house_size;
	private String s_house_price;
	private String s_house_floor;
	private File photo;
	private String photoFileName;
	private String photoContentType;
    private String s_house_limit;
    
    private String submit;
	

	public SellHouseModel getSellHouseModel() {
		return sellHouseModel;
	}



	public ISellHouseService getiSellHouseService() {
		return iSellHouseService;
	}



	public String getS_house_address() {
		return s_house_address;
	}



	public String getS_house_size() {
		return s_house_size;
	}



	public String getS_house_price() {
		return s_house_price;
	}



	public String getS_house_floor() {
		return s_house_floor;
	}



	

	public String getSubmit() {
		return submit;
	}



	public void setSubmit(String submit) {
		this.submit = submit;
	}



	public File getPhoto() {
		return photo;
	}



	public void setPhoto(File photo) {
		this.photo = photo;
	}



	public String getPhotoFileName() {
		return photoFileName;
	}



	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}



	public String getPhotoContentType() {
		return photoContentType;
	}



	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}



	public String getS_house_limit() {
		return s_house_limit;
	}



	public void setS_house_address(String s_house_address) {
		this.s_house_address = s_house_address;
	}



	public void setS_house_size(String s_house_size) {
		this.s_house_size = s_house_size;
	}



	public void setS_house_price(String s_house_price) {
		this.s_house_price = s_house_price;
	}



	public void setS_house_floor(String s_house_floor) {
		this.s_house_floor = s_house_floor;
	}



	public void setS_house_limit(String s_house_limit) {
		this.s_house_limit = s_house_limit;
	}



	@Autowired
	public void setiSellHouseService(ISellHouseService iSellHouseService) {
		this.iSellHouseService = iSellHouseService;
	}

	

	public void setSellHouseModel(SellHouseModel sellHouseModel) {
		this.sellHouseModel = sellHouseModel;
	}


	


	@Override
	public String add() throws Exception {
		// TODO Auto-generated method stub
		
		sellHouseModel = new SellHouseModel();
		sellHouseModel.setS_house_address(s_house_address);
		sellHouseModel.setS_house_floor(s_house_floor);
		sellHouseModel.setS_house_limit(s_house_limit);
		sellHouseModel.setContextType(photoContentType);
		sellHouseModel.setFilename(photoFileName);
		sellHouseModel.setS_house_size(s_house_size);
		sellHouseModel.setS_house_price(s_house_price);
		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");
		iSellHouseService.add(sellHouseModel,photo,userModel.getUser_id());
		
		return "success";
		
	}



	@Override
	public String modify() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("modify");
		iSellHouseService.modify(sellHouseModel);
		return "success";
	}



	@Override
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("delete");
		iSellHouseService.delete(sellHouseModel);
		return "success";
		
	}



	@Override
	public String dispatch() throws Exception {
		// TODO Auto-generated method stub
		
		switch (submit) {
		case "修改":
			
			return modify();
			

		case "删除":
			
		return	delete();
			
		}
		
		return "success";
	}








}
