package com.j3a.sherpawebuser.controller;

import javax.inject.Singleton;

import org.primefaces.event.FlowEvent;

import com.j3a.sherpawebuser.dbEntityClasses.Contrat;
import com.j3a.sherpawebuser.dbEntityClasses.Morale;
import com.j3a.sherpawebuser.dbEntityClasses.Physique;

@Singleton
public class DeclarationSinistreControler {

	public DeclarationSinistreControler() {
		// TODO Auto-generated constructor stub
	}
	
	
	private Physique monPhysique = new Physique();
	private Morale maMorale = new Morale();
	private Contrat monContrat = new Contrat();
	private boolean skip;
	
	public void rechercherDossierProduction(){//By ALekerand
	
	}
	
	public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }

	public Physique getMonPhysique() {
		return monPhysique;
	}

	public void setMonPhysique(Physique monPhysique) {
		this.monPhysique = monPhysique;
	}

	public Morale getMaMorale() {
		return maMorale;
	}

	public void setMaMorale(Morale maMorale) {
		this.maMorale = maMorale;
	}

	public Contrat getMonContrat() {
		return monContrat;
	}

	public void setMonContrat(Contrat monContrat) {
		this.monContrat = monContrat;
	}

}
