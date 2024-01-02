package com.xl1.stts.abonnement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.xl1.stts.abonnement.dto.AbonnementDTO;
import com.xl1.stts.abonnement.entity.Abonnement;
import com.xl1.stts.abonnement.service.IAbonnementService;
@Component
public class AbonnementAction extends ActionSupport{
	@Autowired
	private IAbonnementService iAbonnementService;
	public AbonnementDTO abonnement = new AbonnementDTO();
	public String[] typesAb = new String[] {"GSM","INT"};
	public List<AbonnementDTO> abonnements;
	public String type;
	
	
	public String index() {
		abonnements = iAbonnementService.listAbonnements();
		return SUCCESS;
	}
	
	public String getSubForm() {
		return SUCCESS;
	}
	
	public String save() {
		iAbonnementService.addAbonnement(abonnement);
		abonnements = iAbonnementService.listAbonnements();
		return SUCCESS;
	}

}
