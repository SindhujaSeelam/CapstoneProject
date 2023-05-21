package com.example.medicareproject.entity;

import java.sql.Date;


import jakarta.persistence.*;

@Entity
public class medicines {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String mrp;
	String sale;
	String discamt;
	String disper;
	String img;
	int quantity;
	String status;
	@Override
	public String toString() {
		return "medicines [id=" + id + ", name=" + name + ", mrp=" + mrp + ", sale=" + sale + ", discamt=" + discamt
				+ ", disper=" + disper + ", img=" + img + ", quantity=" + quantity + ", status=" + status + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	public String getDiscamt() {
		return discamt;
	}
	public void setDiscamt(String discamt) {
		this.discamt = discamt;
	}
	public String getDisper() {
		return disper;
	}
	public void setDisper(String disper) {
		this.disper = disper;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

	
	
	
	
	

}
