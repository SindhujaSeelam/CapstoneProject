package com.example.medicareproject.entity;

import jakarta.persistence.*;

@Entity
public class cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int userid;
	int productid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	@Override
	public String toString() {
		return "cart [id=" + id + ", userid=" + userid + ", productid=" + productid + "]";
	}
	
	
	

}
