package pers.lisiyan.relestate.controller;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pers.lisiyan.relestate.model.SellHouseModel;
import pers.lisiyan.relestate.service.ISellHouseService;

@Controller("sellHousePhotoShowController")
public class SellHousePhotoShowController {

	private ISellHouseService iSellHouseService;
	
	private SellHouseModel sellHouseModel;
	
	private int s_house_id;

	public ISellHouseService getiSellHouseService() {
		return iSellHouseService;
	}

	@Autowired
	public void setiSellHouseService(ISellHouseService iSellHouseService) {
		this.iSellHouseService = iSellHouseService;
	}

	public SellHouseModel getSellHouseModel() {
		return sellHouseModel;
	}

	public void setSellHouseModel(SellHouseModel sellHouseModel) {
		this.sellHouseModel = sellHouseModel;
	}

	
	
	public int getS_house_id() {
		return s_house_id;
	}

	public void setS_house_id(int s_house_id) {
		this.s_house_id = s_house_id;
	}

	public InputStream getInputStream() throws Exception{
	
		InputStream result=null;
		
		System.out.println("id="+s_house_id);
	
		sellHouseModel = iSellHouseService.getQueryById(s_house_id);
		if (sellHouseModel != null && sellHouseModel.getFilename() != null) {
		
			result = sellHouseModel.getS_house_pricture().getBinaryStream();
			
		}else {
			sellHouseModel = iSellHouseService.getQueryById(1);
			result = sellHouseModel.getS_house_pricture().getBinaryStream();
		}
		
		return result;
	}
	
	public String show() throws Exception
	{
		
		return "success";
	}
	
	
	
}
