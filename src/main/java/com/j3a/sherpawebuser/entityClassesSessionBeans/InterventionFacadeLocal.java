/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Intervention;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface InterventionFacadeLocal {

    void create(Intervention intervention);

    void edit(Intervention intervention);

    void remove(Intervention intervention);

    Intervention find(Object id);

    List<Intervention> findAll();

    List<Intervention> findRange(int[] range);

    int count();
    
}
