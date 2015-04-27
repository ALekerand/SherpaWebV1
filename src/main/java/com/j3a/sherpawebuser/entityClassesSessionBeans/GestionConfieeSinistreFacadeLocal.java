/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GestionConfieeSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GestionConfieeSinistreFacadeLocal {

    void create(GestionConfieeSinistre gestionConfieeSinistre);

    void edit(GestionConfieeSinistre gestionConfieeSinistre);

    void remove(GestionConfieeSinistre gestionConfieeSinistre);

    GestionConfieeSinistre find(Object id);

    List<GestionConfieeSinistre> findAll();

    List<GestionConfieeSinistre> findRange(int[] range);

    int count();
    
}
