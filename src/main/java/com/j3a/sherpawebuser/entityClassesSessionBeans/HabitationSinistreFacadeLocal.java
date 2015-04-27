/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.HabitationSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface HabitationSinistreFacadeLocal {

    void create(HabitationSinistre habitationSinistre);

    void edit(HabitationSinistre habitationSinistre);

    void remove(HabitationSinistre habitationSinistre);

    HabitationSinistre find(Object id);

    List<HabitationSinistre> findAll();

    List<HabitationSinistre> findRange(int[] range);

    int count();
    
}
