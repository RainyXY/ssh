package pers.lisiyan.relestate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserModel {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	@Column(name = "user_email")
	private String user_email;
	
	@Column(name = "user_password")
	private String user_password;
	
	@Column(name = "user_tel")
	private String user_tel;	
	

	@OneToOne
	@JoinColumn(name="i_id")
	private IdentityModel identity;
	
	

	@OneToMany(mappedBy = "sell_user")
	private Set<SellHouseModel> sellhouses;
	@OneToMany(mappedBy = "rent_user")
	private Set<RentHouseModel> renthouses;

	@ManyToMany(mappedBy = "users")
	private Set<ContractModel> contracts;

	public Set<ContractModel> getContracts() {
		return contracts;
	}

	public void setContracts(Set<ContractModel> contracts) {
		this.contracts = contracts;
	}
	
	

	public IdentityModel getIdentity() {
		return identity;
	}

	public void setIdentity(IdentityModel identity) {
		this.identity = identity;
	}

	public Set<RentHouseModel> getRenthouses() {
		return renthouses;
	}

	public void setRenthouses(Set<RentHouseModel> renthouses) {
		this.renthouses = renthouses;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getUser_password() {
		return user_password;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	public Set<SellHouseModel> getSellhouses() {
		return sellhouses;
	}

	public void setSellhouses(Set<SellHouseModel> sellhouses) {
		this.sellhouses = sellhouses;
	}

}
