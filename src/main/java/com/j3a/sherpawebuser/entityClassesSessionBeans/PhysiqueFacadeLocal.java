/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Physique;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PhysiqueFacadeLocal {

    void create(Physique physique);

    void edit(Physique physique);

    void remove(Physique physique);

    Physique find(Object id);

    List<Physique> findAll();

    List<Physique> findRange(int[] range);

    int count();
    
}
