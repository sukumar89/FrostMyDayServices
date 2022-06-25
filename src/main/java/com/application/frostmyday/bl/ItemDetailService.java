package com.application.frostmyday.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.frostmyday.model.ItemDetails;
import com.application.frostmyday.model.ItemDetailsRepository;


@Service
public class ItemDetailService {


	@Autowired
	private ItemDetailsRepository itemDetailsRepository;
	
	public List<ItemDetails> getAllItemDetails() {
		List<ItemDetails> itemdetails = new ArrayList<>();
		itemDetailsRepository.findAll().forEach(itemdetails::add);
		//System.out.println(itemdetails.get(0).);
		return itemdetails;
	}

	public Optional<ItemDetails> getItemDetails(Integer id) {

		// return itemdetails.stream().filter(t ->
		// t.getId().equals(id)).findFirst().get();
		return itemDetailsRepository.findById(id);
	}

	public void createItemDetails(ItemDetails itemdetails) {
		// itemdetails.add(itemdetail);
		itemDetailsRepository.save(itemdetails);
	}

	public void updateItemDetails(Integer id, ItemDetails itemdetails) {
		/*
		 * for (int i=0; i<itemdetails.size();i++) { ItemDetail d = itemdetails.get(i);
		 * if(d.getId().equals(id)); itemdetails.set(i, itemdetail); return;
		 */
		itemDetailsRepository.save(itemdetails);

	}

	public void deleteItemDetails(Integer id) {
		// itemdetails.removeIf(t -> t.getId().equals(id));
		itemDetailsRepository.deleteById(id);
	}

}
