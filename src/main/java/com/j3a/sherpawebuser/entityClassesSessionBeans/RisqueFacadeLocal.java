/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Risque;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface RisqueFacadeLocal {

    void create(Risque risque);

    void edit(Risque risque);

    void remove(Risque risque);

    Risque find(Object id);

    List<Risque> findAll();

    List<Risque> findRange(int[] range);

    int count();
    
}
