/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Permis;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PermisFacadeLocal {

    void create(Permis permis);

    void edit(Permis permis);

    void remove(Permis permis);

    Permis find(Object id);

    List<Permis> findAll();

    List<Permis> findRange(int[] range);

    int count();
    
}
