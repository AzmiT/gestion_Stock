package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class LigneCommandeClient implements Serializable{

@Id
@GeneratedValue
private long idLigneCommandeClient;

@ManyToOne
@JoinColumn(name="idArticle")
private Article article;

@ManyToOne
@JoinColumn(name="idCommandeClient")
private CommandeClient commandeClient;

public long getIdLigneCommandeClient() {
	return idLigneCommandeClient;
}

public void setIdLigneCommandeClient(long id) {
	this.idLigneCommandeClient = id;
}

public Article getArticle() {
	return article;
}

public void setArticle(Article article) {
	this.article = article;
}

public CommandeClient getCommandeClient() {
	return commandeClient;
}

public void setCommandeClient(CommandeClient commandeClient) {
	this.commandeClient = commandeClient;
}
}
