package com.xl1.stts.abonnement.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "INT")
public class AbonnementInternet extends Abonnement{

	private int debit;

	public AbonnementInternet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AbonnementInternet(Date dateAbonnement, double solde, boolean actif, int debit) {
		super(dateAbonnement, solde, actif);
		this.debit = debit;
	}
	
	public AbonnementInternet(Long id, Date dateAbonnement, double solde, boolean actif, int debit) {
		super(id, dateAbonnement, solde, actif);
		this.debit = debit;
	}

	public int getDebit() {
		return debit;
	}

	public void setDebit(int debit) {
		this.debit = debit;
	}
	
	
	
	
	
	
}
