/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.OptionsGarantie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface OptionsGarantieFacadeLocal {

    void create(OptionsGarantie optionsGarantie);

    void edit(OptionsGarantie optionsGarantie);

    void remove(OptionsGarantie optionsGarantie);

    OptionsGarantie find(Object id);

    List<OptionsGarantie> findAll();

    List<OptionsGarantie> findRange(int[] range);

    int count();
    
}
