/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Compagnie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CompagnieFacadeLocal {

    void create(Compagnie compagnie);

    void edit(Compagnie compagnie);

    void remove(Compagnie compagnie);

    Compagnie find(Object id);

    List<Compagnie> findAll();

    List<Compagnie> findRange(int[] range);

    int count();
    
}
