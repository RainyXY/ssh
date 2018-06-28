package pers.lisiyan.relestate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="contract")
public class ContractModel {

	@Id
	@Column(name="c_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int c_id; 
	@Column(name="house_id")
	private int house_id;
	@Column(name="user_id")
	private int user_id;
	@ManyToMany
	@JoinTable(
			name="userstocontracts",
			joinColumns={@JoinColumn(name="c_id")},
			inverseJoinColumns={@JoinColumn(name="user_id")}
			  
	)
	
	private Set<UserModel> users=null;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	
	
	public int getHouse_id() {
		return house_id;
	}
	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Set<UserModel> getUsers() {
		return users;
	}
	public void setUsers(Set<UserModel> users) {
		this.users = users;
	}
	
}
