package pers.lisiyan.relestate.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="sellhouse")
public class SellHouseModel {
	
	@Id
	@Column(name="s_house_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int s_house_id;
	@Column(name="s_house_address")
	private String s_house_address;
	@Column(name="s_house_size")
	private String s_house_size;
	@Column(name="s_house_price")
	private String s_house_price;
	@Column(name="s_house_floor")
	private String s_house_floor;
	@Column(name="s_house_pricture")
	private Blob s_house_pricture;
	@Column(name="filename")
	private String  filename;
	@Column(name="contextType")
	private String contextType;
	@Column(name="s_house_limit")
	private String s_house_limit;
	@ManyToOne
	@JoinColumn(name="user_id") 
    private UserModel sell_user;
	public int getS_house_id() {
		return s_house_id;
	}
	public String getS_house_address() {
		return s_house_address;
	}
	public void setS_house_address(String s_house_address) {
		this.s_house_address = s_house_address;
	}
	public String getS_house_size() {
		return s_house_size;
	}
	public void setS_house_size(String s_house_size) {
		this.s_house_size = s_house_size;
	}
	public String getS_house_price() {
		return s_house_price;
	}
	public void setS_house_price(String s_house_price) {
		this.s_house_price = s_house_price;
	}
	public String getS_house_floor() {
		return s_house_floor;
	}
	public void setS_house_floor(String s_house_floor) {
		this.s_house_floor = s_house_floor;
	}
	public Blob getS_house_pricture() {
		return s_house_pricture;
	}
	public void setS_house_pricture(Blob s_house_pricture) {
		this.s_house_pricture = s_house_pricture;
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
	public String getS_house_limit() {
		return s_house_limit;
	}
	public void setS_house_limit(String s_house_limit) {
		this.s_house_limit = s_house_limit;
	}
	public UserModel getSell_user() {
		return sell_user;
	}
	public void setSell_user(UserModel sell_user) {
		this.sell_user = sell_user;
	}
	public void setS_house_id(int s_house_id) {
		this.s_house_id = s_house_id;
	}

	



}
