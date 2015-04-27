/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AssureIa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AssureIaFacadeLocal {

    void create(AssureIa assureIa);

    void edit(AssureIa assureIa);

    void remove(AssureIa assureIa);

    AssureIa find(Object id);

    List<AssureIa> findAll();

    List<AssureIa> findRange(int[] range);

    int count();
    
}
