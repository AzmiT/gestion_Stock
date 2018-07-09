package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entites.CommandeFournisseur;

public interface iCommandeFournisseurService {

     public CommandeFournisseur save(CommandeFournisseur entity);
	   
	 public CommandeFournisseur update(CommandeFournisseur entity);
	   
	 public List<CommandeFournisseur> selectAll();
	   
	 public List<CommandeFournisseur> selectAll(String sortField,String sort) ;
	   
	 public CommandeFournisseur getById(long id);
	   
	 public void remove(long id);
	   
	 public CommandeFournisseur findOne(String paramName,Object paramValue);	 
	  
	 public CommandeFournisseur findOne(String paramNames[],Object paramValues[]);	   

	 public int findCountBy(String paramName,Object paramValue);}
