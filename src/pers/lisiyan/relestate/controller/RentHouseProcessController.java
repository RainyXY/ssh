package pers.lisiyan.relestate.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import pers.lisiyan.relestate.model.RentHouseModel;
import pers.lisiyan.relestate.model.UserModel;
import pers.lisiyan.relestate.service.IRentHouseService;

@Controller("rentHouseProcessController")
public class RentHouseProcessController implements IProcessController {

	private IRentHouseService iRentHouseService;

	private RentHouseModel rentHouseModel;

	private String r_house_address;

	private String r_house_size;

	private String r_house_price;

	private String r_house_floor;

	private File photo;

	private String photoFileName;

	private String photoContentType;

	private String r_house_note;

	private String submit;

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

	public String getR_house_address() {
		return r_house_address;
	}

	public void setR_house_address(String r_house_address) {
		this.r_house_address = r_house_address;
	}

	public String getR_house_size() {
		return r_house_size;
	}

	public void setR_house_size(String r_house_size) {
		this.r_house_size = r_house_size;
	}

	public String getR_house_price() {
		return r_house_price;
	}

	public void setR_house_price(String r_house_price) {
		this.r_house_price = r_house_price;
	}

	public String getR_house_floor() {
		return r_house_floor;
	}

	public void setR_house_floor(String r_house_floor) {
		this.r_house_floor = r_house_floor;
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

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
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

	public String getR_house_note() {
		return r_house_note;
	}

	public void setR_house_note(String r_house_note) {
		this.r_house_note = r_house_note;
	}

	@Override
	public String add() throws Exception {
		// TODO Auto-generated method stub

		rentHouseModel = new RentHouseModel();
		rentHouseModel.setR_house_address(r_house_address);
		rentHouseModel.setR_house_floor(r_house_floor);
		rentHouseModel.setR_house_note(r_house_note);
		rentHouseModel.setR_house_price(r_house_price);
		rentHouseModel.setR_house_size(r_house_size);
		rentHouseModel.setContextType(photoContentType);
		rentHouseModel.setFilename(photoFileName);
		UserModel userModel = (UserModel) ActionContext.getContext().getSession().get("um");
		System.out.println("RentHouseProcessController id="+userModel.getUser_id());
		iRentHouseService.add(rentHouseModel, photo,userModel.getUser_id());
//		iRentHouseService.add(rentHouseModel, photo);

		return "success";
	}

	@Override
	public String modify() throws Exception {
		// TODO Auto-generated method stub
		iRentHouseService.modify(rentHouseModel);
		return "success";
	}

	@Override
	public String delete() throws Exception {
		// TODO Auto-generated method stub

		iRentHouseService.delete(rentHouseModel);
		return "success";
	}

	@Override
	public String dispatch() throws Exception {
		// TODO Auto-generated method stub

		switch (submit) {
		case "修改":

			return modify();

		case "删除":

			return delete();

		}

		return "success";
	}

}
