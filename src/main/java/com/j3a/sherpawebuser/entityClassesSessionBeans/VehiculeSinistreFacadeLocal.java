/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.VehiculeSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface VehiculeSinistreFacadeLocal {

    void create(VehiculeSinistre vehiculeSinistre);

    void edit(VehiculeSinistre vehiculeSinistre);

    void remove(VehiculeSinistre vehiculeSinistre);

    VehiculeSinistre find(Object id);

    List<VehiculeSinistre> findAll();

    List<VehiculeSinistre> findRange(int[] range);

    int count();
    
}
