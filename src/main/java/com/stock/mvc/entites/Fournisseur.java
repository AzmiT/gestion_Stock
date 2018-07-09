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
public class Fournisseur implements Serializable{

@Id
@GeneratedValue
private long idFournisseur;

private String nom;

private String prenom;

private String adresse;

private String photo;

private String mail;

@OneToMany(mappedBy="fournisseur")
private List<CommandeFournisseur> fournisseurs;




public Fournisseur() {
	super();
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public long getIdFournisseur() {
	return idFournisseur;
}

public void setIdFournisseur(long id) {
	this.idFournisseur = id;
}
}
