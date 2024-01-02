 package com.xl1.stts.abonnement.dao;

import java.util.Date;
import java.util.List;

import com.xl1.stts.abonnement.entity.Abonnement;

public interface IAbonnementDAO {
	public void addAbonnement(Abonnement ab);
	public void updateAbonnement(Abonnement p);
	public Abonnement getAbonnement(Long id);
	public void deleteAbonnement(Long id);
	public void consommer(Long id, double mt);
	public List<Abonnement> listAbonnements(boolean actif);
	public List<Abonnement> listAbonnements(Date d1, Date d2);
	public List<Abonnement> listAbonnements();
}
