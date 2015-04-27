/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ApporteurHabitation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ApporteurHabitationFacadeLocal {

    void create(ApporteurHabitation apporteurHabitation);

    void edit(ApporteurHabitation apporteurHabitation);

    void remove(ApporteurHabitation apporteurHabitation);

    ApporteurHabitation find(Object id);

    List<ApporteurHabitation> findAll();

    List<ApporteurHabitation> findRange(int[] range);

    int count();
    
}
