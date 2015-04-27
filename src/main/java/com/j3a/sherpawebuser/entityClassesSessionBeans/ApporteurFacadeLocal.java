/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Apporteur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ApporteurFacadeLocal {

    void create(Apporteur apporteur);

    void edit(Apporteur apporteur);

    void remove(Apporteur apporteur);

    Apporteur find(Object id);

    List<Apporteur> findAll();

    List<Apporteur> findRange(int[] range);

    int count();
    
}
