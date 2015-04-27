/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ApporteurAliment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ApporteurAlimentFacadeLocal {

    void create(ApporteurAliment apporteurAliment);

    void edit(ApporteurAliment apporteurAliment);

    void remove(ApporteurAliment apporteurAliment);

    ApporteurAliment find(Object id);

    List<ApporteurAliment> findAll();

    List<ApporteurAliment> findRange(int[] range);

    int count();
    
}
