/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Reassurance;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ReassuranceFacadeLocal {

    void create(Reassurance reassurance);

    void edit(Reassurance reassurance);

    void remove(Reassurance reassurance);

    Reassurance find(Object id);

    List<Reassurance> findAll();

    List<Reassurance> findRange(int[] range);

    int count();
    
}
