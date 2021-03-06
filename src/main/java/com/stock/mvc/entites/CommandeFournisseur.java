package com.stock.mvc.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;


@Entity
@Table
public class CommandeFournisseur implements Serializable{

@Id
@GeneratedValue
private long idCommandeFournisseur;

@Temporal(TemporalType.TIMESTAMP)
private Date dateCommande;

@ManyToOne
@JoinColumn(name="idFournisseur")
private Fournisseur fournisseur;

@OneToMany(mappedBy="commandeFournisseur")
private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

public long getIdCommandeFournisseur() {
	return idCommandeFournisseur;
}

public void setIdCommandeFournisseur(long id) {
	this.idCommandeFournisseur = id;
	
}

public Date getDateCommande() {
	return dateCommande;
}

public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
}

public Fournisseur getFournisseur() {
	return fournisseur;
}

public void setFournisseur(Fournisseur fournisseur) {
	this.fournisseur = fournisseur;
}

public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
	return ligneCommandeFournisseurs;
}

public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
	this.ligneCommandeFournisseurs = ligneCommandeFournisseurs;
}
}
