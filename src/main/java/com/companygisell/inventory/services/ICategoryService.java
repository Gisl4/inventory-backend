package com.companygisell.inventory.services;
import org.springframework.http.ResponseEntity;

import com.companygisell.inventory.model.Category;
import com.companygisell.inventory.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);

}
