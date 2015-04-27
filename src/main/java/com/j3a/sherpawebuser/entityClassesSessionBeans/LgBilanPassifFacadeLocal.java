/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.LgBilanPassif;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface LgBilanPassifFacadeLocal {

    void create(LgBilanPassif lgBilanPassif);

    void edit(LgBilanPassif lgBilanPassif);

    void remove(LgBilanPassif lgBilanPassif);

    LgBilanPassif find(Object id);

    List<LgBilanPassif> findAll();

    List<LgBilanPassif> findRange(int[] range);

    int count();
    
}
