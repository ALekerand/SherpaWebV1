package com.j3a.sherpawebuser.view;

import java.io.Serializable;
import java.util.Calendar;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

import com.j3a.sherpawebuser.controller.ObjectService;
import com.j3a.sherpawebuser.dbEntityClasses.Contrat;
import com.j3a.sherpawebuser.dbEntityClasses.Personne;
import com.j3a.sherpawebuser.dbEntityClasses.Quittance;
import com.j3a.sherpawebuser.dbEntityClasses.Vehicule;
@Named
@Dependent
public class IdGenerateur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ObjectService objectService;



	public String getPoliceID(String pVte, String user, String cAt) {
		String pV = pVte.substring(2);
		String Us = user;
		int i = Calendar.getInstance().get(Calendar.YEAR);
		String annee = "" + i;
		String pseudo = pV + Us + annee.substring(2) + cAt.substring(0, 3);
		String IdPolice = getObjectService().getCodeTable(pseudo, 12, 3,
				"contrat", "NUM_POLICE");
		System.out.println("****Id de la police =" + IdPolice);
		return IdPolice;
	}

	public String getIdNewAvenant(String numPolice) {

		String pseudo = numPolice + "-Av";
		String IdAvenant = getObjectService().getCodeTable(pseudo, 18, 2,
				"avenant", "NUM_AVENANT");
		System.out.println("****Id de l' Avenant =" + IdAvenant);
		return IdAvenant;
	}

	public String getIdVehiAss(Contrat ctrat) {
		String IdVehiAss = ctrat.getNumPolice() + "Va";
		// size=15+2
		return IdVehiAss;
	}

	public String getIdVehicule(Contrat ctrat) {
		// String pseudo = vehiAss.getId().substring(0, 17);
		String pseudo = ctrat.getNumPolice() + "-V";
		// 001KA1014AUT009-V001 = 17+3
		String IdVehi = getObjectService().getCodeTable(pseudo, 17, 3,
				"vehicule", "CODE_VEHICULE");
		return IdVehi;
	}

	public String getIdHistoMvmt(Vehicule vehi) {
		// idVehi= 15+"-V"+numOrd(3)=20
		// histoMvmt = idVehi(20)+"-Hmv"(4)+numOrd(3)=27
		// 001KA1015AUT013-V001-Hmv001

		String pseudo = vehi.getCodeVehicule() + "-Hmv";
		String IdHistoMvmt = "";

		if (vehi.getCodeVehicule().length() == 26) {
			// idVehi= 001KA1015AUT011-Av01Va-V01
			// histoMvmt = idVehi(26)+"-Hmv"(4)+numOrd(3)=33
			IdHistoMvmt = getObjectService().getCodeTable(pseudo, 30, 3,
					"histo_mouvement", "CODE_HISTO_MOUVEMENT");
		}

		if (vehi.getCodeVehicule().length() == 21) {
			// idVehi= 001KA1014AUT004Va-V01(21)+"-Hmv"(4)+numOrd(3)=28
			IdHistoMvmt = getObjectService().getCodeTable(pseudo, 25, 3,
					"histo_mouvement", "CODE_HISTO_MOUVEMENT");
		}
		if (vehi.getCodeVehicule().length() == 20) {
			// idVehi= 001KA1015AUT015-V001
			// histoMvmt = idVehi(20)+"-Hmv"(4)+numOrd(3)=27
			IdHistoMvmt = getObjectService().getCodeTable(pseudo, 24, 3,
					"histo_mouvement", "CODE_HISTO_MOUVEMENT");
		}

		return IdHistoMvmt;
	}

	public String getIdHistoPropVehi(String IdVehi) {
		String pseudo = IdVehi + "-H";
		String idHisto = "";
		//

		if (IdVehi.length() == 26) {
			// idVehi= 001KA1015AUT011-Av01Va-V01
			// histoProp = idVehi(26)+"-H"(2)+numOrd(2)=30
			idHisto = getObjectService().getCodeTable(pseudo, 28, 2,
					"histo_proprietes_vehicule", "CODE_HISTO_VEHICULE");
		}

		if (IdVehi.length() == 21) {
			// idVehi= 001KA1014AUT004Va-V01
			// histoProp = idVehi(21)+"-H"(2)+numOrd(2)=25
			idHisto = getObjectService().getCodeTable(pseudo, 23, 2,
					"histo_proprietes_vehicule", "CODE_HISTO_VEHICULE");
		}

		if (IdVehi.length() == 20) {
			// idVehi= 001KA1015AUT015-V001
			// histoProp = idVehi(20)+"-H"(2)+numOrd(2)=24
			idHisto = getObjectService().getCodeTable(pseudo, 22, 2,
					"histo_proprietes_vehicule", "CODE_HISTO_VEHICULE");
		}
		return idHisto;
	}

	


	public String getIdQuittance(String numAvenant) {
		// l'id du trafic dans le cas des autres avenant
		String idQuit = "Qt-" + numAvenant;
		System.out.println("****Id de la quittance =" + idQuit);
		return idQuit;
	}

	

	

	public String getIdGarChoisieAuto(Vehicule vehi) {
		String pseudo = vehi.getCodeVehicule() + "GA";
		String IdGarchoi = getObjectService().getCodeTable(pseudo, 28, 2,
				"garantie_choisie", "CODE_GARANTIE_CHOISIE");
		System.out.println("****Id de la GarantieChoisie du vehicule "
				+ vehi.getCodeVehicule() + "=" + IdGarchoi);
		return IdGarchoi;
	}

	
	
	

	public String getIdReglement(Quittance quittance) {
		String pseudo = quittance.getCodeQuittance() + "-R";
		String idReg = getObjectService().getCodeTable(pseudo, 25, 2,
				"reglement", "CODE_REGLEMENT");
		return idReg;
	}
	


	public String getIdContact(Personne personne) {
		String pseudo = personne.getNumSouscripteur() + "-C";
		String idReg = getObjectService().getCodeTable(pseudo, 11, 2,
				"contact", "ID_CONTACT");
		return idReg;
	}

	public ObjectService getObjectService() {
		return objectService;
	}

	public void setObjectService(ObjectService objectService) {
		this.objectService = objectService;
	}


	
	
}
