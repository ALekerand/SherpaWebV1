/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieGarantieChoisieFacadeLocal {

    void create(GarantieGarantieChoisie garantieGarantieChoisie);

    void edit(GarantieGarantieChoisie garantieGarantieChoisie);

    void remove(GarantieGarantieChoisie garantieGarantieChoisie);

    GarantieGarantieChoisie find(Object id);

    List<GarantieGarantieChoisie> findAll();

    List<GarantieGarantieChoisie> findRange(int[] range);

    int count();
    
}
