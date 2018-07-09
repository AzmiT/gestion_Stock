package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.Category;

public interface iCategoryService {
	
    public Category save(Category entity);
	   
	 public Category update(Category entity);
	   
	 public List<Category> selectAll();
	   
	 public List<Category> selectAll(String sortField,String sort) ;
	   
	 public Category getById(long id);
	   
	 public void remove(long id);
	   
	 public Category findOne(String paramName,Object paramValue);	 
	  
	 public Category findOne(String paramNames[],Object paramValues[]);	   

	 public int findCountBy(String paramName,Object paramValue);

}
