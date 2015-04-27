/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ListeAdherent;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ListeAdherentFacadeLocal {

    void create(ListeAdherent listeAdherent);

    void edit(ListeAdherent listeAdherent);

    void remove(ListeAdherent listeAdherent);

    ListeAdherent find(Object id);

    List<ListeAdherent> findAll();

    List<ListeAdherent> findRange(int[] range);

    int count();
    
}
