/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ListeGestionConfie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ListeGestionConfieFacadeLocal {

    void create(ListeGestionConfie listeGestionConfie);

    void edit(ListeGestionConfie listeGestionConfie);

    void remove(ListeGestionConfie listeGestionConfie);

    ListeGestionConfie find(Object id);

    List<ListeGestionConfie> findAll();

    List<ListeGestionConfie> findRange(int[] range);

    int count();
    
}
