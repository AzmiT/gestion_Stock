package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.Fournisseur;

public interface iFournisseurService {

     public Fournisseur save(Fournisseur entity);
	   
	 public Fournisseur update(Fournisseur entity);
	   
	 public List<Fournisseur> selectAll();
	   
	 public List<Fournisseur> selectAll(String sortField,String sort) ;
	   
	 public Fournisseur getById(long id);
	   
	 public void remove(long id);
	   
	 public Fournisseur findOne(String paramName,Object paramValue);	 
	  
	 public Fournisseur findOne(String paramNames[],Object paramValues[]);	   

	 public int findCountBy(String paramName,Object paramValue);}
