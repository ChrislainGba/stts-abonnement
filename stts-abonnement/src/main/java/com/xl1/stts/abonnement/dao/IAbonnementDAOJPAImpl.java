package com.xl1.stts.abonnement.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.xl1.stts.abonnement.entity.Abonnement;

public class IAbonnementDAOJPAImpl implements IAbonnementDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addAbonnement(Abonnement ab) {
		em.persist(ab);
		
	}

	@Override
	public void updateAbonnement(Abonnement ab) {
		em.merge(ab);
		
	}

	@Override
	public Abonnement getAbonnement(Long id) {
		// TODO Auto-generated method stub
		return em.find(Abonnement.class, id);
	}

	@Override
	public void deleteAbonnement(Long id) {
		Abonnement abn = getAbonnement(id);
		em.remove(abn);
		
	}

	@Override
	public List<Abonnement> listAbonnements(boolean actif) {
		Query req = em.createQuery("select a from Abonnement a where a.actif=:x");
		req.setParameter("x", actif);
		return req.getResultList();
	}

	@Override
	public List<Abonnement> listAbonnements(Date d1, Date d2) {
		Query req = em.createQuery("select a from Abonnement a where a.dateAbonnement between :x and :y");
		req.setParameter("x", d1);
		req.setParameter("x", d2);
		return req.getResultList();
	}

	@Override
	public void consommer(Long id, double mt) {
		Abonnement ab = getAbonnement(id);
		ab.setSolde(ab.getSolde() - mt);
		
	}
	@Override
	public List<Abonnement> listAbonnements() {
		Query req = em.createQuery("select a from Abonnement a");
		return req.getResultList();
	}
	
	
}
