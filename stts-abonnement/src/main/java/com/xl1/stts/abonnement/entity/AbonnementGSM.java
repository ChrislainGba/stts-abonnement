package com.xl1.stts.abonnement.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "GSM")
public class AbonnementGSM extends Abonnement{

	private int fidelio;
	
	public AbonnementGSM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AbonnementGSM(Date dateAbonnement, double solde, boolean actif, int fidelio) {
		super(dateAbonnement, solde, actif);
		this.fidelio = fidelio;
	}
	

	public AbonnementGSM(Long id, Date dateAbonnement, double solde, boolean actif, int fidelio) {
		super(id, dateAbonnement, solde, actif);
		this.fidelio = fidelio;
	}

	public int getFidelio() {
		return fidelio;
	}

	public void setFidelio(int fidelio) {
		this.fidelio = fidelio;
	}

	

	
	
	
}
