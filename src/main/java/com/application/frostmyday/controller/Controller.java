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

import com.application.frostmyday.Service.ItemDetailService;
import com.application.frostmyday.model.ItemDetail;


@RestController
@RequestMapping("/frostmyday")
public class Controller {
	@Autowired
	private ItemDetailService itemDetailsService;

	@GetMapping("/itemdetails")
	public List<ItemDetail> getItemDetails() {
		return itemDetailsService.getItemDetails();
	}
	
	@GetMapping("/itemdetails/{id}")
	public Optional<ItemDetail> getItemDetail(@PathVariable Integer id ) {
		return itemDetailsService.getItemDetail(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/itemdetails")
	public void createItemDetail(@RequestBody ItemDetail itemdetail) {
		itemDetailsService.createItemDetail(itemdetail);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/itemdetails/{id}")
	public void updateItemDetail(@PathVariable Integer id, @RequestBody ItemDetail itemdetail) {
		itemDetailsService.updateItemDetail(id, itemdetail);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/itemdetails/{id}")
	public void deleteItemDetail(@PathVariable Integer id) {
		itemDetailsService.deleteItemDetail(id);
	}
			
		

}
