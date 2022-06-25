package com.application.frostmyday.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "item_details")



public class ItemDetails {
	@Id
	@JsonProperty("id")
	private Integer item_id;
	@JsonProperty("desc")
	private String item_desc;
	@JsonProperty("name")
	private String item_name;
	@JsonProperty("price")
	private String item_price;
	@JsonProperty("image")
	private String item_image;
	public Integer getItem_id() {
		return item_id;
	}
	public String getItem_desc() {
		return item_desc;
	}
	public String getItem_name() {
		return item_name;
	}
	public String getItem_price() {
		return item_price;
	}
	public String getItem_image() {
		return item_image;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public void setItem_price(String item_price) {
		this.item_price = item_price;
	}
	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}
	
	
}