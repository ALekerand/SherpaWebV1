/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Emission;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface EmissionFacadeLocal {

    void create(Emission emission);

    void edit(Emission emission);

    void remove(Emission emission);

    Emission find(Object id);

    List<Emission> findAll();

    List<Emission> findRange(int[] range);

    int count();
    
}
