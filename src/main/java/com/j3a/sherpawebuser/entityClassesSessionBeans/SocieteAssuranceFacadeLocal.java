/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.SocieteAssurance;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface SocieteAssuranceFacadeLocal {

    void create(SocieteAssurance societeAssurance);

    void edit(SocieteAssurance societeAssurance);

    void remove(SocieteAssurance societeAssurance);

    SocieteAssurance find(Object id);

    List<SocieteAssurance> findAll();

    List<SocieteAssurance> findRange(int[] range);

    int count();
    
}
