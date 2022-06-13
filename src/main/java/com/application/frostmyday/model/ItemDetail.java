package com.application.frostmyday.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_details")

public class ItemDetail {
	@Id
	private Integer item_id;
	private String item_desc;
	private String item_name;
	private String item_price;
	private String item_image;

	public ItemDetail() {

	}

	public ItemDetail(Integer item_id, String item_desc, String item_name, String item_price, String item_image) {
		super();
		this.item_id = item_id;
		this.item_desc = item_desc;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_image = item_image;
	}

	public Integer getId() {
		return item_id;
	}

	public void setId(Integer id) {
		this.item_id = id;
	}

	public String getDesc() {
		return item_desc;
	}

	public void setDesc(String item_desc) {
		this.item_desc = item_desc;
	}

	public String getName() {
		return item_name;
	}

	public void setName(String item_name) {
		this.item_name = item_name;
	}

	public String getPrice() {
		return item_price;
	}

	public void setPrice(String item_price) {
		this.item_price = item_price;
	}

	public String getImage() {
		return item_image;
	}

	public void setImage(String item_image) {
		this.item_image = item_image;
	}

}
