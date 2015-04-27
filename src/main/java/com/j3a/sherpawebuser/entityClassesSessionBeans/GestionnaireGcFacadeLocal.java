/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GestionnaireGc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GestionnaireGcFacadeLocal {

    void create(GestionnaireGc gestionnaireGc);

    void edit(GestionnaireGc gestionnaireGc);

    void remove(GestionnaireGc gestionnaireGc);

    GestionnaireGc find(Object id);

    List<GestionnaireGc> findAll();

    List<GestionnaireGc> findRange(int[] range);

    int count();
    
}
