package com.j3a.sherpawebuser.controller;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

import com.j3a.sherpawebuser.dbEntityClasses.Garantie;
import com.j3a.sherpawebuser.entityClassesSessionBeans.ApporteurVehiculeFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.AvenantFacadeLocal;
import com.j3a.sherpawebuser.entityClassesSessionBeans.ConducteurFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.ConduireVehiculeFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.ContratFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.GarantieChoisieFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.GarantieFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.GarantieGarantieChoisieFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.HistoMouvementFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.HistoProprietesVehiculeFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.QuittanceFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.VehiculeFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.VehiculeZoneGeographiqueFacade;
import com.j3a.sherpawebuser.entityClassesSessionBeans.VehiculesAssuresFacade;

@Named
@Dependent
@Stateless
public class ObjectService {
	 @PersistenceContext(unitName = "com.j3a_SherpaWebUser_war_1.0-SNAPSHOTPU")
	    private EntityManager em;

	    
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	 /*@EJB
	    private AvenantFacadeLocal avenantFacade;
	  @EJB
	    private ConducteurFacade conducteurFacade;
	  @EJB
	  private VehiculeFacade vehiculeFacade;
	  @EJB
	  private VehiculesAssuresFacade vehiculesAssuresFacade;
	  @EJB
	  private GarantieChoisieFacade garantieChoisieFacade;
	  @EJB
	  private GarantieFacade garantieFacade;
	  @EJB
	  private GarantieGarantieChoisieFacade garantieGarantieChoisieFacade;
	  @EJB
	    private ConduireVehiculeFacade conduireVehiculeFacade;
	  @EJB
	    private HistoMouvementFacade histoMouvementFacade;
	  @EJB
	  private HistoProprietesVehiculeFacade histoProprietesVehiculeFacade;
	  @EJB
	  private ContratFacade contratFacade;
	  @EJB
	  private QuittanceFacade quittanceFacade;
	  @EJB
	    private VehiculeZoneGeographiqueFacade vehiculeZoneGeographiqueFacade;
	  @EJB
	  private ApporteurVehiculeFacade apporteurVehiculeFacade;*/
	  
	  
	  
	
	  public String getCodeTable(String pseudo, int taillCar, int taillChifr,
				String nomTable, String nomCOL) {
			// Methode crï¿½ation d'un id code alphanumrique chronologique d'une
					// ligne de table ds la BD
					

					String query = "SELECT MAX(CAST(SUBSTRING(" + nomCOL + " FROM "
							+ (taillCar + 1) + " FOR " + (taillChifr)
							+ ") AS UNSIGNED )) AS NUMBER FROM " + nomTable + " WHERE "+nomCOL+" LIKE '"+pseudo+"%'";
					Integer v = null;
					try {
					
						v = (Integer) 	em.createNativeQuery(query).getSingleResult();
								//.addScalar("NUMBER", Hibernate.INTEGER).uniqueResult();
						
						String tC = String.valueOf(taillChifr);
						if (v == null) {
							//int numOrdT = i+1;
							String numOrd= String.format("%0"+tC+"d", 1);
							System.out.println("///////Verification requette V null");
							System.out.println("///////Verification requette V null et pseudo = "+pseudo);
							String s = pseudo + numOrd;
							System.out.println("///////Verification requette V null et pseudo + numrd = "+s);
							return s;
						} else {
							v++;
							String numOrd= String.format("%0"+tC+"d", v);
							System.out.println("///////Verification requette V non null");
							String s = pseudo + numOrd;
							return s;
						}
					} catch (Exception e) {
						e.printStackTrace();
						return "blag aaa";
					}
					

		}
	  
	  public List<Garantie> getListGarantieByRisque(String codeRisque)
				throws EntityNotFoundException {
			List<Garantie> list = (List<Garantie>)em.createNativeQuery(
							" from Garantie where CODE_RISQUE='" + codeRisque
									+ "' order by Id ASC").getResultList();
			return list;
		}
	  

	 /* public GarantieGarantieChoisieFacade getGarantieGarantieChoisieFacade() {
			return garantieGarantieChoisieFacade;
		}

		public void setGarantieGarantieChoisieFacade(
				GarantieGarantieChoisieFacade garantieGarantieChoisieFacade) {
			this.garantieGarantieChoisieFacade = garantieGarantieChoisieFacade;
		}
		  
		public ConducteurFacade getConducteurFacade() {
			return conducteurFacade;
		}

		public void setConducteurFacade(ConducteurFacade conducteurFacade) {
			this.conducteurFacade = conducteurFacade;
		}

		public VehiculeFacade getVehiculeFacade() {
			return vehiculeFacade;
		}

		public void setVehiculeFacade(VehiculeFacade vehiculeFacade) {
			this.vehiculeFacade = vehiculeFacade;
		}

		public AvenantFacadeLocal getAvenantFacade() {
			return avenantFacade;
		}

		public void setAvenantFacade(AvenantFacadeLocal avenantFacade) {
			this.avenantFacade = avenantFacade;
		}

		public GarantieChoisieFacade getGarantieChoisieFacade() {
			return garantieChoisieFacade;
		}

		public void setGarantieChoisieFacade(GarantieChoisieFacade garantieChoisieFacade) {
			this.garantieChoisieFacade = garantieChoisieFacade;
		}

		public VehiculeZoneGeographiqueFacade getVehiculeZoneGeographiqueFacade() {
			return vehiculeZoneGeographiqueFacade;
		}

		public void setVehiculeZoneGeographiqueFacade(
				VehiculeZoneGeographiqueFacade vehiculeZoneGeographiqueFacade) {
			this.vehiculeZoneGeographiqueFacade = vehiculeZoneGeographiqueFacade;
		}

		public ApporteurVehiculeFacade getApporteurVehiculeFacade() {
			return apporteurVehiculeFacade;
		}

		public void setApporteurVehiculeFacade(
				ApporteurVehiculeFacade apporteurVehiculeFacade) {
			this.apporteurVehiculeFacade = apporteurVehiculeFacade;
		}

		public ConduireVehiculeFacade getConduireVehiculeFacade() {
			return conduireVehiculeFacade;
		}

		public void setConduireVehiculeFacade(
				ConduireVehiculeFacade conduireVehiculeFacade) {
			this.conduireVehiculeFacade = conduireVehiculeFacade;
		}

		public HistoMouvementFacade getHistoMouvementFacade() {
			return histoMouvementFacade;
		}

		public void setHistoMouvementFacade(HistoMouvementFacade histoMouvementFacade) {
			this.histoMouvementFacade = histoMouvementFacade;
		}

		public HistoProprietesVehiculeFacade getHistoProprietesVehiculeFacade() {
			return histoProprietesVehiculeFacade;
		}

		public void setHistoProprietesVehiculeFacade(
				HistoProprietesVehiculeFacade histoProprietesVehiculeFacade) {
			this.histoProprietesVehiculeFacade = histoProprietesVehiculeFacade;
		}

		public ContratFacade getContratFacade() {
			return contratFacade;
		}

		public void setContratFacade(ContratFacade contratFacade) {
			this.contratFacade = contratFacade;
		}

		public QuittanceFacade getQuittanceFacade() {
			return quittanceFacade;
		}

		public void setQuittanceFacade(QuittanceFacade quittanceFacade) {
			this.quittanceFacade = quittanceFacade;
		}

		public VehiculesAssuresFacade getVehiculesAssuresFacade() {
			return vehiculesAssuresFacade;
		}

		public void setVehiculesAssuresFacade(
				VehiculesAssuresFacade vehiculesAssuresFacade) {
			this.vehiculesAssuresFacade = vehiculesAssuresFacade;
		}

		public GarantieFacade getGarantieFacade() {
			return garantieFacade;
		}

		public void setGarantieFacade(GarantieFacade garantieFacade) {
			this.garantieFacade = garantieFacade;
		}*/

   
}
