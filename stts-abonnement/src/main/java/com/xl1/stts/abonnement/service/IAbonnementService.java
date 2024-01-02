package com.xl1.stts.abonnement.service;

import java.util.Date;
import java.util.List;

import com.xl1.stts.abonnement.dto.AbonnementDTO;
import com.xl1.stts.abonnement.entity.Abonnement;
import com.xl1.stts.abonnement.web.AbonnementAction;

public interface IAbonnementService {
	public void addAbonnement(AbonnementDTO ab);
	public void updateAbonnement(AbonnementDTO ab);
	public AbonnementDTO getAbonnement(Long id);
	public void deleteAbonnement(Long id);
	public void consommer(Long id, double mt);
	public List<AbonnementDTO> listAbonnements(boolean actif);
	public List<AbonnementDTO> listAbonnements();
	public List<AbonnementDTO> listAbonnements(Date d1, Date d2);
}
