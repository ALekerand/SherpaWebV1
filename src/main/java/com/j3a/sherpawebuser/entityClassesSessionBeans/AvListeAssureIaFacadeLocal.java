/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AvListeAssureIa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AvListeAssureIaFacadeLocal {

    void create(AvListeAssureIa avListeAssureIa);

    void edit(AvListeAssureIa avListeAssureIa);

    void remove(AvListeAssureIa avListeAssureIa);

    AvListeAssureIa find(Object id);

    List<AvListeAssureIa> findAll();

    List<AvListeAssureIa> findRange(int[] range);

    int count();
    
}
