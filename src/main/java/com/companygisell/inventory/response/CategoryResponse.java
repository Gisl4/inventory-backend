package com.companygisell.inventory.response;
import java.util.List;
import com.companygisell.inventory.model.Category;
import lombok.Data;

@Data
public class CategoryResponse {
	
	private List<Category> category;

}
