/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.controller;

import com.j3a.sherpawebuser.controller.interfaces.Flow_XXX_Interface;
import com.j3a.sherpawebuser.dbEntityClasses.Avenant;
import com.j3a.sherpawebuser.entityClassesSessionBeans.AvenantFacadeLocal;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author J3A-AFRIQUE
 */
@Named
@Dependent
public class Flow_XXX_Controls implements Flow_XXX_Interface{
    @EJB
    private AvenantFacadeLocal avenantFacade;

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public Flow_XXX_Controls() {
    }

    
    
    
    @Override
    public Avenant getAvenantAt(Date d) {
        Avenant A = null;
        List<Avenant> findAll = avenantFacade.findAll();
        for (Avenant a:findAll){
            if(a.getDateEmission().equals(d))
                A=a;
        }
        return A;
        
    }
    
}
