package com.application.frostmyday.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.frostmyday.bl.ItemDetailService;
import com.application.frostmyday.model.ItemDetails;

@RestController
@RequestMapping("/frostmyday")
public class Controller {
	@Autowired
	private ItemDetailService itemDetailsService;

	@GetMapping("/allitemdetails")
	public List<ItemDetails> getAllItemDetails() {
		//Return records from DB
		return itemDetailsService.getAllItemDetails();
	}

	@GetMapping("/itemdetails/{id}")
	public Optional<ItemDetails> getItemDetails(@PathVariable Integer id) {
		return itemDetailsService.getItemDetails(id);
	}
	//Add new Items
	@RequestMapping(method = RequestMethod.POST, value = "/itemdetails")
	public void createItemDetails(@RequestBody ItemDetails itemdetail) {
		itemDetailsService.createItemDetails(itemdetail);
	}
	// Modify
	@RequestMapping(method = RequestMethod.PUT, value = "/itemdetails/{id}")
	public void updateItemDetails(@PathVariable Integer id, @RequestBody ItemDetails itemdetail) {
		itemDetailsService.updateItemDetails(id, itemdetail);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/itemdetails/{id}")
	public void deleteItemDetails(@PathVariable Integer id) {
		itemDetailsService.deleteItemDetails(id);
	}

}
