/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AvenantListeGestionConfie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AvenantListeGestionConfieFacadeLocal {

    void create(AvenantListeGestionConfie avenantListeGestionConfie);

    void edit(AvenantListeGestionConfie avenantListeGestionConfie);

    void remove(AvenantListeGestionConfie avenantListeGestionConfie);

    AvenantListeGestionConfie find(Object id);

    List<AvenantListeGestionConfie> findAll();

    List<AvenantListeGestionConfie> findRange(int[] range);

    int count();
    
}
