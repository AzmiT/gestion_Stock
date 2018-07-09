package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.LigneCommandeClient;

public interface iLigneCommandeClientService {

     public LigneCommandeClient save(LigneCommandeClient entity);
	   
	 public LigneCommandeClient update(LigneCommandeClient entity);
	   
	 public List<LigneCommandeClient> selectAll();
	   
	 public List<LigneCommandeClient> selectAll(String sortField,String sort) ;
	   
	 public LigneCommandeClient getById(long id);
	   
	 public void remove(long id);
	   
	 public LigneCommandeClient findOne(String paramName,Object paramValue);	 
	  
	 public LigneCommandeClient findOne(String paramNames[],Object paramValues[]);	   

	 public int findCountBy(String paramName,Object paramValue);}
