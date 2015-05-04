package com.j3a.sherpawebuser.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;
import javax.inject.Named;

import com.j3a.sherpawebuser.dbEntityClasses.Categorie;
import com.j3a.sherpawebuser.dbEntityClasses.SousCatVehicule;


@Named
public class ScatVehiCvtr implements Converter {

	public ScatVehiCvtr() {
		// TODO Auto-generated constructor stub
	}
	//Spring Apporteur Service is injected...
	@Inject
	 ObjectService objectService;
	 
	 public List<SousCatVehicule> CatVehiList=new ArrayList<SousCatVehicule>(); 
	 
	 //Logger logs=Logger.getLogger(ScatVehiCvtr.class);
	

	public Object getAsObject(FacesContext facesContext, UIComponent component, String submittedValue) {  
		/*System.out.print("Avant lapel");
		getCatVehiList();
		System.out.print("Apres lapel");*/
	        if (submittedValue.trim().equals("")) {  
	            return null;  
	        } else {  
	            try {
	            	String X = submittedValue;
	                for (SousCatVehicule c : getCatVehiList()) {  
	                    if (c.getLibelleSousCatVehicule().equalsIgnoreCase(X)) {  
	                        return c;  
	                    }  
	                }  
	            } catch(Exception exception) {  
	            	//logs.info(">>>>/ "+exception.getMessage());
	            	exception.printStackTrace();
	                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid SousCategorie Vehicule"));  
	            }  
	        }  
	  
	        return null;  
	    }  
	  
	   public String getAsString(FacesContext facesContext, UIComponent component, Object value) {  
	        if (value == null || value.equals("")) {  
	            return "";  
	        } else {  
	            return ((SousCatVehicule) value).getLibelleSousCatVehicule();  
	        }  
	    }   
	 
	 
	 
	public ObjectService getObjectService() {
		return objectService;
	}
	public void setObjectService(ObjectService objectService) {
		this.objectService = objectService;
	}
	/*public List<SousCatVehicule> getsCatVehiList() {
		List<SousCatVehicule> A = new ArrayList<SousCatVehicule>();
		for (Object c : getObjectService().getObjects("SousCatVehicule")) {  
			A.add((SousCatVehicule) c);  
            } 
		
		return A;
	}
	public void setsCatVehiList(List<SousCatVehicule> sCatVehiList) {
		this.sCatVehiList = sCatVehiList;
	}
*/
	 public List<SousCatVehicule> getCatVehiList() {
		if(CatVehiList.isEmpty()){
			SousCatVehicule A = new SousCatVehicule("SCAT1");
			A.setLibelleSousCatVehicule("Vehicule de Tourisme");
			Categorie catA = new Categorie();
			catA.setCodeCategorie("1");
			catA.setLibelleCategorie("Promenade et Affaires");
			A.setCodeCategorie(catA);
		
			A.setTarif("TARIF1");
			CatVehiList.add(A);
			
			SousCatVehicule B = new SousCatVehicule("SCAT12");
			B.setLibelleSousCatVehicule("Vehicule Professionnel");
			B.setCodeCategorie(catA);
			
			B.setTarif("TARIF12");
			CatVehiList.add(B);
			
			SousCatVehicule C = new SousCatVehicule("SCAT2");
			C.setLibelleSousCatVehicule("Transport pour propre compte");
			Categorie catC = new Categorie();
			catC.setCodeCategorie("2");
			catC.setLibelleCategorie("Transport pour propre compte");
			C.setCodeCategorie(catC);
			C.setTarif("TARIF2");
			CatVehiList.add(C);
			
			SousCatVehicule D = new SousCatVehicule("SCAT3");
			D.setLibelleSousCatVehicule("Transport Public de Marchandises");
			Categorie catD = new Categorie();
			catD.setCodeCategorie("3");
			catD.setLibelleCategorie("Transport Public de Marchandises");
			D.setCodeCategorie(catD);
			D.setTarif("TARIF3");
			CatVehiList.add(D);
			
			/*SousCatVehicule E = new SousCatVehicule("SCAT4");
			E.setLibelleSousCatVehicule("Transport Public de Voyageurs");
			Categorie catE = new Categorie();
			catE.setId("4");
			catE.setLibelleCategorie("Transport Public de Voyageurs");
			E.setCodeCategorie(catE);
			E.setTarif("TARIF4");
			CatVehiList.add(E);*/
			
			SousCatVehicule F = new SousCatVehicule("SCAT5");
			F.setLibelleSousCatVehicule("Vehicules Motorises 2 OU 3 Roues");
			Categorie catF = new Categorie();
			catF.setCodeCategorie("5");
			catF.setLibelleCategorie("Vehicules Motorises 2 OU 3 Roues");
			F.setCodeCategorie(catF);
			F.setTarif("TARIF5");
			CatVehiList.add(F);
			
			SousCatVehicule G = new SousCatVehicule("SCAT6");
			G.setLibelleSousCatVehicule("Garagistes");
			Categorie catG = new Categorie();
			catG.setCodeCategorie("6");
			catG.setLibelleCategorie("Garagistes");
			G.setCodeCategorie(catG);
			G.setTarif("TARIF6");
			CatVehiList.add(G);
			
			SousCatVehicule H = new SousCatVehicule("SCAT7");
			H.setLibelleSousCatVehicule("Auto Ecole");
			Categorie catH = new Categorie();
			catH.setCodeCategorie("7");
			catH.setLibelleCategorie("Auto Ecole");
			H.setCodeCategorie(catH);
			H.setTarif("TARIF7");
			CatVehiList.add(H);
			
			SousCatVehicule I = new SousCatVehicule("SCAT8");
			I.setLibelleSousCatVehicule("V�hicules de Location");
			Categorie catI = new Categorie();
			catI.setCodeCategorie("8");
			catI.setLibelleCategorie("V�hicules de Location");
			I.setCodeCategorie(catI);
			I.setTarif("TARIF8");
			CatVehiList.add(I);
			
			SousCatVehicule J = new SousCatVehicule("SCAT9");
			J.setLibelleSousCatVehicule("Engins de Chantier");
			Categorie catJ = new Categorie();
			catJ.setCodeCategorie("9");
			catJ.setLibelleCategorie("Engins de Chantier");
			J.setCodeCategorie(catJ);
			J.setTarif("TARIF9");
			CatVehiList.add(J);
			
			SousCatVehicule K = new SousCatVehicule("SCAT10");
			K.setLibelleSousCatVehicule("Véhicule spéciaux");
			Categorie catK = new Categorie();
			catK.setCodeCategorie("10");
			catK.setLibelleCategorie("Véhicule spéciaux");
			K.setCodeCategorie(catK);
			K.setTarif("TARIF10");
			CatVehiList.add(K);
		}
		return CatVehiList;
		}

		public void setCatVehiList(List<SousCatVehicule> catVehiList) {
			CatVehiList = catVehiList;
		}
	 
	 
}
