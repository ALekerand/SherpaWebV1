/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.VehiculeZoneGeographique;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface VehiculeZoneGeographiqueFacadeLocal {

    void create(VehiculeZoneGeographique vehiculeZoneGeographique);

    void edit(VehiculeZoneGeographique vehiculeZoneGeographique);

    void remove(VehiculeZoneGeographique vehiculeZoneGeographique);

    VehiculeZoneGeographique find(Object id);

    List<VehiculeZoneGeographique> findAll();

    List<VehiculeZoneGeographique> findRange(int[] range);

    int count();
    
}
