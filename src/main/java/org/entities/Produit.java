package org.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

import com.sun.istack.NotNull;


@Entity 

public class Produit {
	@Id @GeneratedValue 
 private Long id;

 private String designation;
 private Double Prix;
 @NotNull
 private int quantite;
 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getPrix() {
		return Prix;
	}
	public void setPrix(Double prix) {
		Prix = prix;
	}
	public int getQantite() {
		return quantite;
	}
	public void setQantite(int qantite) {
		this.quantite = qantite;
	}
	public Produit(String designation, Double prix, int qantite) {
		super();
		this.designation = designation;
		Prix = prix;
		this.quantite = qantite;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
