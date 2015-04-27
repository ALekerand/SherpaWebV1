/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.view;

import com.j3a.sherpawebuser.controller.interfaces.Flow_XXX_Interface;
import com.j3a.sherpawebuser.dbEntityClasses.Avenant;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author J3A-AFRIQUE
 */
@Named
@Dependent
public class TestMB {

    @Inject
    private Flow_XXX_Interface flowInterf;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public TestMB() {
    }
    private Date dateAt;
    private Avenant aven;
    
    public void listAven(){
        setAven(flowInterf.getAvenantAt(getDateAt())) ;
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
