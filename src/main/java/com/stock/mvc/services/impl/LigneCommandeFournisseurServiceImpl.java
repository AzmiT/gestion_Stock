package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.ILigneCommadeFournisseurDao;
import com.stock.mvc.entites.LigneCommandeFournisseur;
import com.stock.mvc.services.iLigneCommandeFournisseurService;

@Transactional
public class LigneCommandeFournisseurServiceImpl implements iLigneCommandeFournisseurService{

	ILigneCommadeFournisseurDao dao;
	
	public void setDao(ILigneCommadeFournisseurDao dao) {
		this.dao = dao;
	}
	
	@Override
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeFournisseur getById(long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(long id) {
		dao.remove(id);
	}

	@Override
	public LigneCommandeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}

