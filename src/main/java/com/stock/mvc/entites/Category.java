package com.stock.mvc.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Category implements Serializable{

@Id
@GeneratedValue
private long idCategory;

private String code;

private String designation;

@OneToMany(mappedBy="category")
private List<Article> articles;



public Category() {
	
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public List<Article> getArticles() {
	return articles;
}

public void setArticles(List<Article> ariticles) {
	this.articles = ariticles;
}

public long getIdCategory() {
	return idCategory;
}

public void setIdCategory(long id) {
	this.idCategory = id;
}
}
