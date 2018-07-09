package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.LigneVente;

public interface iLigneVenteService {

     public LigneVente save(LigneVente entity);
	   
	 public LigneVente update(LigneVente entity);
	   
	 public List<LigneVente> selectAll();
	   
	 public List<LigneVente> selectAll(String sortField,String sort) ;
	   
	 public LigneVente getById(long id);
	   
	 public void remove(long id);
	   
	 public LigneVente findOne(String paramName,Object paramValue);	 
	  
	 public LigneVente findOne(String paramNames[],Object paramValues[]);	   

	 public int findCountBy(String paramName,Object paramValue);}
