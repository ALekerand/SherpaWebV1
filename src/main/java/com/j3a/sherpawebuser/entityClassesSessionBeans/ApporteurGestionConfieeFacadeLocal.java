/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ApporteurGestionConfiee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ApporteurGestionConfieeFacadeLocal {

    void create(ApporteurGestionConfiee apporteurGestionConfiee);

    void edit(ApporteurGestionConfiee apporteurGestionConfiee);

    void remove(ApporteurGestionConfiee apporteurGestionConfiee);

    ApporteurGestionConfiee find(Object id);

    List<ApporteurGestionConfiee> findAll();

    List<ApporteurGestionConfiee> findRange(int[] range);

    int count();
    
}
