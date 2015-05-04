package com.j3a.sherpawebuser.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;

import com.j3a.sherpawebuser.dbEntityClasses.Ville;


public class VilleCvtr implements Converter {

	public VilleCvtr() {
		// TODO Auto-generated constructor stub
	}

	//Spring Apporteur Service is injected...
		 @Inject
		 ObjectService objectService;
		 
		 public List<Ville> villeList; 
		 
		// Logger logs=Logger.getLogger(VilleCvtr.class);
		 
		 public Object getAsObject(FacesContext facesContext, UIComponent component, String submittedValue) {  
		        if (submittedValue.trim().equals("")) {  
		            return null;  
		        } else {  
		            try {  
		            	String X = submittedValue;  
		  
		                for (Ville c : getVilleList()) {  
		                    if (c.getLibelleVille().equalsIgnoreCase(X)) {  
		                        return c;  
		                    }  
		                }  
		  
		            } catch(Exception exception) {  
		            //	logs.info(">>>>/ "+exception.getMessage());
		                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid SousCategorie Vehicule"));  
		            }  
		        }  
		  
		        return null;  
		    }  
		  
		   public String getAsString(FacesContext facesContext, UIComponent component, Object value) {  
		        if (value == null || value.equals("")) {  
		            return "";  
		        } else {  
		            return ((Ville) value).getLibelleVille();  
		        }  
		    }

		public ObjectService getObjectService() {
			return objectService;
		}

		public void setObjectService(ObjectService objectService) {
			this.objectService = objectService;
		}

		public List<Ville> getVilleList() {
			List<Ville> A = new ArrayList<Ville>();
			for (Object c : getObjectService().getVilleFacade().findAll()) {  
				A.add((Ville) c);  
	            } 
			
			return A;
		}

		public void setVilleList(List<Ville> villeList) {
			this.villeList = villeList;
		}  
		   
		   
}
