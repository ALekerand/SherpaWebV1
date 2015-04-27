/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Remboursement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface RemboursementFacadeLocal {

    void create(Remboursement remboursement);

    void edit(Remboursement remboursement);

    void remove(Remboursement remboursement);

    Remboursement find(Object id);

    List<Remboursement> findAll();

    List<Remboursement> findRange(int[] range);

    int count();
    
}
