/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieSante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieGarantieChoisieSanteFacadeLocal {

    void create(GarantieGarantieChoisieSante garantieGarantieChoisieSante);

    void edit(GarantieGarantieChoisieSante garantieGarantieChoisieSante);

    void remove(GarantieGarantieChoisieSante garantieGarantieChoisieSante);

    GarantieGarantieChoisieSante find(Object id);

    List<GarantieGarantieChoisieSante> findAll();

    List<GarantieGarantieChoisieSante> findRange(int[] range);

    int count();
    
}
