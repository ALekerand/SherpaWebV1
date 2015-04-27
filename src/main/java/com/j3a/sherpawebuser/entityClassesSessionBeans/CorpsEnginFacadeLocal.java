/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.CorpsEngin;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CorpsEnginFacadeLocal {

    void create(CorpsEngin corpsEngin);

    void edit(CorpsEngin corpsEngin);

    void remove(CorpsEngin corpsEngin);

    CorpsEngin find(Object id);

    List<CorpsEngin> findAll();

    List<CorpsEngin> findRange(int[] range);

    int count();
    
}
