/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieMrh;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieChoisieMrhFacadeLocal {

    void create(GarantieChoisieMrh garantieChoisieMrh);

    void edit(GarantieChoisieMrh garantieChoisieMrh);

    void remove(GarantieChoisieMrh garantieChoisieMrh);

    GarantieChoisieMrh find(Object id);

    List<GarantieChoisieMrh> findAll();

    List<GarantieChoisieMrh> findRange(int[] range);

    int count();
    
}
