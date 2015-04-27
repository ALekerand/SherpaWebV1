/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ListeHabitation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ListeHabitationFacadeLocal {

    void create(ListeHabitation listeHabitation);

    void edit(ListeHabitation listeHabitation);

    void remove(ListeHabitation listeHabitation);

    ListeHabitation find(Object id);

    List<ListeHabitation> findAll();

    List<ListeHabitation> findRange(int[] range);

    int count();
    
}
