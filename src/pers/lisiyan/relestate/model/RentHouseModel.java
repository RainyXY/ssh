package pers.lisiyan.relestate.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="renthouse")
public class RentHouseModel {

	@Id
	@Column(name="r_house_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int r_house_id ;
	@Column(name="r_house_address")
	private String r_house_address;
	@Column(name="r_house_size")
	private String r_house_size;
	@Column(name="r_house_price")
	private String r_house_price;
	@Column(name="r_house_floor")
	private String r_house_floor;
	@Column(name="r_house_picture")
	private Blob r_house_picture;
	@Column(name="filename")
	private String filename;
	@Column(name="contextType")
	private String contextType;
	@Column(name="r_house_note")
	private String r_house_note;
	@ManyToOne
	@JoinColumn(name="user_id")
    private UserModel rent_user;
	public int getR_house_id() {
		return r_house_id;
	}
	public void setR_house_id(int r_house_id) {
		this.r_house_id = r_house_id;
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
	public Blob getR_house_picture() {
		return r_house_picture;
	}
	public void setR_house_picture(Blob r_house_picture) {
		this.r_house_picture = r_house_picture;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getContextType() {
		return contextType;
	}
	public void setContextType(String contextType) {
		this.contextType = contextType;
	}
	public String getR_house_note() {
		return r_house_note;
	}
	public void setR_house_note(String r_house_note) {
		this.r_house_note = r_house_note;
	}
	public UserModel getRent_user() {
		return rent_user;
	}
	public void setRent_user(UserModel rent_user) {
		this.rent_user = rent_user;
	}
	
}
