/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Medecin;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface MedecinFacadeLocal {

    void create(Medecin medecin);

    void edit(Medecin medecin);

    void remove(Medecin medecin);

    Medecin find(Object id);

    List<Medecin> findAll();

    List<Medecin> findRange(int[] range);

    int count();
    
}
