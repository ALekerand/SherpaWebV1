/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.PaysAction;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PaysActionFacadeLocal {

    void create(PaysAction paysAction);

    void edit(PaysAction paysAction);

    void remove(PaysAction paysAction);

    PaysAction find(Object id);

    List<PaysAction> findAll();

    List<PaysAction> findRange(int[] range);

    int count();
    
}
