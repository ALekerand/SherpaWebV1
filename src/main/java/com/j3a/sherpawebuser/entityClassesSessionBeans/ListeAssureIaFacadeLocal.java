/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ListeAssureIa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ListeAssureIaFacadeLocal {

    void create(ListeAssureIa listeAssureIa);

    void edit(ListeAssureIa listeAssureIa);

    void remove(ListeAssureIa listeAssureIa);

    ListeAssureIa find(Object id);

    List<ListeAssureIa> findAll();

    List<ListeAssureIa> findRange(int[] range);

    int count();
    
}
