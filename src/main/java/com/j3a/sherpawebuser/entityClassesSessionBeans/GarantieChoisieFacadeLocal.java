/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieChoisieFacadeLocal {

    void create(GarantieChoisie garantieChoisie);

    void edit(GarantieChoisie garantieChoisie);

    void remove(GarantieChoisie garantieChoisie);

    GarantieChoisie find(Object id);

    List<GarantieChoisie> findAll();

    List<GarantieChoisie> findRange(int[] range);

    int count();
    
}
