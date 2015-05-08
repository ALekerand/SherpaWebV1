/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.view;

import java.io.Serializable;
import java.util.Date;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.j3a.sherpawebuser.controller.interfaces.Flow_XXX_Interface;
import com.j3a.sherpawebuser.dbEntityClasses.Avenant;

/**
 *	
 * @author J3A-AFRIQUE
 */
@Named 
@ViewScoped
public class TestMB implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
    private Flow_XXX_Interface flowInterf;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public TestMB() {
    }
    
    private Date dateAt;
    private Avenant aven = new Avenant("XXXXXX");
    private String test = "XXXXXXXX";
    
    public void listAven(){
    	System.out.println(aven.getNumAvenant());
        setAven(flowInterf.getAvenantAt(getDateAt())) ;
    }

    
    
    
    
    
    
    
    
    public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public Date getDateAt() {
        return dateAt;
    }

    public void setDateAt(Date dateAt) {
        this.dateAt = dateAt;
    }

    public Avenant getAven() {
        return aven;
    }

    public void setAven(Avenant aven) {
        this.aven = aven;
    }
    
    
}
