/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ApporteurAssure;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ApporteurAssureFacadeLocal {

    void create(ApporteurAssure apporteurAssure);

    void edit(ApporteurAssure apporteurAssure);

    void remove(ApporteurAssure apporteurAssure);

    ApporteurAssure find(Object id);

    List<ApporteurAssure> findAll();

    List<ApporteurAssure> findRange(int[] range);

    int count();
    
}
