/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.HistoProprietesVehicule;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface HistoProprietesVehiculeFacadeLocal {

    void create(HistoProprietesVehicule histoProprietesVehicule);

    void edit(HistoProprietesVehicule histoProprietesVehicule);

    void remove(HistoProprietesVehicule histoProprietesVehicule);

    HistoProprietesVehicule find(Object id);

    List<HistoProprietesVehicule> findAll();

    List<HistoProprietesVehicule> findRange(int[] range);

    int count();
    
}
