package com.xl1.stts.abonnement.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.xl1.stts.abonnement.dao.IAbonnementDAO;
import com.xl1.stts.abonnement.dto.AbonnementDTO;
import com.xl1.stts.abonnement.entity.Abonnement;
import com.xl1.stts.abonnement.mapper.AbonnementMapper;;
@Transactional
public class IAbonnementServiceImpl implements IAbonnementService{
	private IAbonnementDAO dao;
	
	
	public void setDao(IAbonnementDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addAbonnement(AbonnementDTO abDTO) {
		Abonnement ab = AbonnementMapper.toAbonnement(abDTO);
		dao.addAbonnement(ab);
		
	}

	@Override
	public void updateAbonnement(AbonnementDTO abDTO) {
		Abonnement ab = AbonnementMapper.toAbonnement(abDTO);
		dao.updateAbonnement(ab);
		
	}

	@Override
	public AbonnementDTO getAbonnement(Long id) {
		Abonnement ab = dao.getAbonnement(id);
		return AbonnementMapper.toAbonnementDTO(ab);
	}

	@Override
	public void deleteAbonnement(Long id) {
		dao.deleteAbonnement(id);
		
	}

	@Override
	public void consommer(Long id, double mt) {
		dao.consommer(id, mt);
		
	}

	@Override
	public List<AbonnementDTO> listAbonnements(boolean actif) {
		List<Abonnement> abonnements = dao.listAbonnements(actif);
		return AbonnementMapper.toAbonnementDTOList(abonnements);
	}

	@Override
	public List<AbonnementDTO> listAbonnements(Date d1, Date d2) {
		List<Abonnement> abonnements = dao.listAbonnements(d1, d2);
		return AbonnementMapper.toAbonnementDTOList(abonnements);
	}

	@Override
	public List<AbonnementDTO> listAbonnements() {
		List<Abonnement> abonnements = dao.listAbonnements();
		return AbonnementMapper.toAbonnementDTOList(abonnements);
	}


}
