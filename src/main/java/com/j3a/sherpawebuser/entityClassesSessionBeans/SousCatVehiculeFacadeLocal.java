/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.SousCatVehicule;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface SousCatVehiculeFacadeLocal {

    void create(SousCatVehicule sousCatVehicule);

    void edit(SousCatVehicule sousCatVehicule);

    void remove(SousCatVehicule sousCatVehicule);

    SousCatVehicule find(Object id);

    List<SousCatVehicule> findAll();

    List<SousCatVehicule> findRange(int[] range);

    int count();
    
}
