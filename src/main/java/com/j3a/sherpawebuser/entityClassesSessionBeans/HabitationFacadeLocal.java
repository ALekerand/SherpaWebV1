/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Habitation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface HabitationFacadeLocal {

    void create(Habitation habitation);

    void edit(Habitation habitation);

    void remove(Habitation habitation);

    Habitation find(Object id);

    List<Habitation> findAll();

    List<Habitation> findRange(int[] range);

    int count();
    
}
