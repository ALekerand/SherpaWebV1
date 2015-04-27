/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GestionConfieFormule;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GestionConfieFormuleFacadeLocal {

    void create(GestionConfieFormule gestionConfieFormule);

    void edit(GestionConfieFormule gestionConfieFormule);

    void remove(GestionConfieFormule gestionConfieFormule);

    GestionConfieFormule find(Object id);

    List<GestionConfieFormule> findAll();

    List<GestionConfieFormule> findRange(int[] range);

    int count();
    
}
