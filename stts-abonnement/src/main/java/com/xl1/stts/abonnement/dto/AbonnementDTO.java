package com.xl1.stts.abonnement.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

public class AbonnementDTO implements Serializable{
	private Long idAb;
	private Date dateAbonnement;
	private double solde;
	private boolean actif;
	private String type;
	private int fidelio;
	private int debit;
	
	
	

	public AbonnementDTO(Long idAb, Date dateAbonnement, double solde, boolean actif, String type, int fidelio,
			int debit) {
		super();
		this.idAb = idAb;
		this.dateAbonnement = dateAbonnement;
		this.solde = solde;
		this.actif = actif;
		this.type = type;
		this.fidelio = fidelio;
		this.debit = debit;
	}


	public AbonnementDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Date getDateAbonnement() {
		return dateAbonnement;
	}

	public void setDateAbonnement(Date dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}


	public Long getIdAb() {
		return idAb;
	}


	public void setIdAb(Long idAb) {
		this.idAb = idAb;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getFidelio() {
		return fidelio;
	}


	public void setFidelio(int fidelio) {
		this.fidelio = fidelio;
	}


	public int getDebit() {
		return debit;
	}


	public void setDebit(int debit) {
		this.debit = debit;
	}
	
	
	
	

}
