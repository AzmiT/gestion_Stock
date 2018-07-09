package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.LigneCommandeFournisseur;

public interface iLigneCommandeFournisseurService {

     public LigneCommandeFournisseur save(LigneCommandeFournisseur entity);
	   
	 public LigneCommandeFournisseur update(LigneCommandeFournisseur entity);
	   
	 public List<LigneCommandeFournisseur> selectAll();
	   
	 public List<LigneCommandeFournisseur> selectAll(String sortField,String sort) ;
	   
	 public LigneCommandeFournisseur getById(long id);
	   
	 public void remove(long id);
	   
	 public LigneCommandeFournisseur findOne(String paramName,Object paramValue);	 
	  
	 public LigneCommandeFournisseur findOne(String paramNames[],Object paramValues[]);	   

	 public int findCountBy(String paramName,Object paramValue);}
