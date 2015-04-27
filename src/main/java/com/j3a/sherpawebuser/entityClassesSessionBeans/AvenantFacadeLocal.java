/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Avenant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AvenantFacadeLocal {

    void create(Avenant avenant);

    void edit(Avenant avenant);

    void remove(Avenant avenant);

    Avenant find(Object id);

    List<Avenant> findAll();

    List<Avenant> findRange(int[] range);

    int count();
    
}
