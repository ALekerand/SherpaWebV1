/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.VehiculesAssures;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface VehiculesAssuresFacadeLocal {

    void create(VehiculesAssures vehiculesAssures);

    void edit(VehiculesAssures vehiculesAssures);

    void remove(VehiculesAssures vehiculesAssures);

    VehiculesAssures find(Object id);

    List<VehiculesAssures> findAll();

    List<VehiculesAssures> findRange(int[] range);

    int count();
    
}
