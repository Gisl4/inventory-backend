package com.companygisell.inventory.dao;
import org.springframework.data.repository.CrudRepository;
import com.companygisell.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
