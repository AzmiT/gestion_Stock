package com.stock.mvc.entites;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Article implements Serializable{

@Id
@GeneratedValue
private long idArticle;

private String codeArticle;

private String designation;

private BigDecimal prixUnitaireHT;

private BigDecimal tauxTVA;

private BigDecimal prixUnitaireTTC;

private String photo;

@ManyToOne
@JoinColumn(name="idCategory")
private Category category;

public Article() {
	
}

public String getCodeArticle() {
	return codeArticle;
}

public void setCodeArticle(String codeArticle) {
	this.codeArticle = codeArticle;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public BigDecimal getPrixUnitaireHT() {
	return prixUnitaireHT;
}

public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
	this.prixUnitaireHT = prixUnitaireHT;
}

public BigDecimal getTauxTVA() {
	return tauxTVA;
}

public void setTauxTVA(BigDecimal tauxTVA) {
	this.tauxTVA = tauxTVA;
}

public BigDecimal getPrixUnitaireTTC() {
	return prixUnitaireTTC;
}

public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
	this.prixUnitaireTTC = prixUnitaireTTC;
}

public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}

public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}

public long getIdArticle() {
	return idArticle;
}

public void setIdArticle(long idArticle) {
	this.idArticle = idArticle;
}
}