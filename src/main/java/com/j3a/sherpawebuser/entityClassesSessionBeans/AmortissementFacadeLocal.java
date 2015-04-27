/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Amortissement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AmortissementFacadeLocal {

    void create(Amortissement amortissement);

    void edit(Amortissement amortissement);

    void remove(Amortissement amortissement);

    Amortissement find(Object id);

    List<Amortissement> findAll();

    List<Amortissement> findRange(int[] range);

    int count();
    
}
