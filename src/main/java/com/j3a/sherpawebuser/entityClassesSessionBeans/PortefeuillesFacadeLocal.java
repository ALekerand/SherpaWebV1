/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Portefeuilles;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PortefeuillesFacadeLocal {

    void create(Portefeuilles portefeuilles);

    void edit(Portefeuilles portefeuilles);

    void remove(Portefeuilles portefeuilles);

    Portefeuilles find(Object id);

    List<Portefeuilles> findAll();

    List<Portefeuilles> findRange(int[] range);

    int count();
    
}
