package pers.lisiyan.relestate.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Util.LogUtil;
import pers.lisiyan.relestate.model.SellHouseModel;
import pers.lisiyan.relestate.service.ISellHouseService;

@Controller("sellHouseFrontController")
public class SellHouseFrontController implements IFrontController {

	private ISellHouseService iSellHouseService;

	private SellHouseModel sellHouseModel;

	private String s_house_address;
	private String s_house_size;
	private String s_house_price;
	private String s_house_floor;
	private File photo;
	private String photoFileName;
	private String photoContentType;
	private String s_house_limit;
	private int s_house_id;

	private int rows = 1;

	private int pageIndex = 1;

	private int pages;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	private List<SellHouseModel> sellHouseModels;

	public ISellHouseService getiSellHouseService() {
		return iSellHouseService;
	}

	public SellHouseModel getSellHouseModel() {
		return sellHouseModel;
	}

	public int getS_house_id() {
		return s_house_id;
	}

	public void setS_house_id(int s_house_id) {
		this.s_house_id = s_house_id;
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

	public File getPhoto() {
		return photo;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public String getPhotoContentType() {
		return photoContentType;
	}

	public String getS_house_limit() {
		return s_house_limit;
	}

	public List<SellHouseModel> getSellHouseModels() {
		return sellHouseModels;
	}

	public void setSellHouseModels(List<SellHouseModel> sellHouseModels) {
		this.sellHouseModels = sellHouseModels;
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

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
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
	public String tomain() throws Exception {
		// TODO Auto-generated method stub
		return "tomain";
	}

	@Override
	public String toshow() throws Exception {
		// TODO Auto-generated method stub

		pages = iSellHouseService.getPageCountBySearch(rows);

		if (pageIndex > pages) {

			pageIndex = pages;
		}
		
		if (pageIndex <= 0) {
			
			pageIndex = 1;
		}

		sellHouseModels = iSellHouseService.getListBySearchWithPage(rows, pageIndex);

		LogUtil.println(SellHouseFrontController.class, "toshow()");

		return "toshow";

	}

	@Override
	public String tomessage() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(s_house_id);
		sellHouseModel = iSellHouseService.getQueryById(s_house_id);
		System.out.println(sellHouseModel.getS_house_address());
		return "tomessage";
	}

}
