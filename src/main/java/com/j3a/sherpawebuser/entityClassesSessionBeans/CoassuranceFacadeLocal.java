/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Coassurance;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CoassuranceFacadeLocal {

    void create(Coassurance coassurance);

    void edit(Coassurance coassurance);

    void remove(Coassurance coassurance);

    Coassurance find(Object id);

    List<Coassurance> findAll();

    List<Coassurance> findRange(int[] range);

    int count();
    
}
