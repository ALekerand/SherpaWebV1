/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieMrh;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieGarantieChoisieMrhFacadeLocal {

    void create(GarantieGarantieChoisieMrh garantieGarantieChoisieMrh);

    void edit(GarantieGarantieChoisieMrh garantieGarantieChoisieMrh);

    void remove(GarantieGarantieChoisieMrh garantieGarantieChoisieMrh);

    GarantieGarantieChoisieMrh find(Object id);

    List<GarantieGarantieChoisieMrh> findAll();

    List<GarantieGarantieChoisieMrh> findRange(int[] range);

    int count();
    
}
