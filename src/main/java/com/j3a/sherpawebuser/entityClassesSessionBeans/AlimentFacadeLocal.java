/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Aliment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AlimentFacadeLocal {

    void create(Aliment aliment);

    void edit(Aliment aliment);

    void remove(Aliment aliment);

    Aliment find(Object id);

    List<Aliment> findAll();

    List<Aliment> findRange(int[] range);

    int count();
    
}
