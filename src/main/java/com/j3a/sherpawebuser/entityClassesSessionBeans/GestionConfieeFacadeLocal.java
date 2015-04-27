/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GestionConfiee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GestionConfieeFacadeLocal {

    void create(GestionConfiee gestionConfiee);

    void edit(GestionConfiee gestionConfiee);

    void remove(GestionConfiee gestionConfiee);

    GestionConfiee find(Object id);

    List<GestionConfiee> findAll();

    List<GestionConfiee> findRange(int[] range);

    int count();
    
}
