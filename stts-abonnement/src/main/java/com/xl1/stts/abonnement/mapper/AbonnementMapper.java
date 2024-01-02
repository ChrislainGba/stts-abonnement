package com.xl1.stts.abonnement.mapper;

import java.util.List;

import javax.persistence.DiscriminatorValue;

import com.xl1.stts.abonnement.dto.AbonnementDTO;
import com.xl1.stts.abonnement.entity.Abonnement;
import com.xl1.stts.abonnement.entity.AbonnementGSM;
import com.xl1.stts.abonnement.entity.AbonnementInternet;

import freemarker.core.ReturnInstruction.Return;

public class AbonnementMapper {
	public static AbonnementDTO toAbonnementDTO(Abonnement ab) {
		if(ab == null)
			return null;
		else if (ab instanceof AbonnementGSM) {
			AbonnementGSM abGSM = (AbonnementGSM) ab;
			return new AbonnementDTO(ab.getId(), ab.getDateAbonnement(), ab.getSolde(), ab.isActif(),ab.getClass().getAnnotation(DiscriminatorValue.class).value(), abGSM.getFidelio(), 0);
		}else {
			AbonnementInternet abINT = (AbonnementInternet) ab;
			return new AbonnementDTO(ab.getId(), ab.getDateAbonnement(), ab.getSolde(), ab.isActif(),ab.getClass().getAnnotation(DiscriminatorValue.class).value(), 0, abINT.getDebit());
		}
		
	}
	
	public static List<AbonnementDTO> toAbonnementDTOList(List<Abonnement> abonnements){
		if(abonnements == null) {
			return null;
		}else {
			return abonnements.stream().map(AbonnementMapper::toAbonnementDTO).toList();
		}
		
	}
	
	public static Abonnement toAbonnement(AbonnementDTO abDTO) {
		if(abDTO == null)
			return null;
		else if (abDTO.getType().equals("GSM")) {
			return new AbonnementGSM(abDTO.getIdAb(), abDTO.getDateAbonnement(), abDTO.getSolde(), abDTO.isActif(), abDTO.getFidelio());
		}else {
			return new AbonnementInternet(abDTO.getIdAb(), abDTO.getDateAbonnement(), abDTO.getSolde(), abDTO.isActif(), abDTO.getDebit());
		}
		
	}
	
	public static List<Abonnement> toAbonnementList(List<AbonnementDTO> abonnementsDTO){
		if(abonnementsDTO == null) {
			return null;
		}else {
			return abonnementsDTO.stream().map(AbonnementMapper::toAbonnement).toList();
		}
		
	}
}
