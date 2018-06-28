package pers.lisiyan.relestate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="identity")
public class IdentityModel {

	
	@Id
	@Column(name="i_id")
	private int i_id;
	
	@Column(name="user_id")
	private int user_id;

	@OneToOne(mappedBy = "identity")
	
	private UserModel userModel;

	public int getI_id() {
		return i_id;
	}
	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public UserModel getUserModel() {
		return userModel;
	}
	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	
}
