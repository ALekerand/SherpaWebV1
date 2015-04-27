/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Gestionnaire;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GestionnaireFacadeLocal {

    void create(Gestionnaire gestionnaire);

    void edit(Gestionnaire gestionnaire);

    void remove(Gestionnaire gestionnaire);

    Gestionnaire find(Object id);

    List<Gestionnaire> findAll();

    List<Gestionnaire> findRange(int[] range);

    int count();
    
}
