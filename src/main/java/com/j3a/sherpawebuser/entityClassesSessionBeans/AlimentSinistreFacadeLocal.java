/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AlimentSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AlimentSinistreFacadeLocal {

    void create(AlimentSinistre alimentSinistre);

    void edit(AlimentSinistre alimentSinistre);

    void remove(AlimentSinistre alimentSinistre);

    AlimentSinistre find(Object id);

    List<AlimentSinistre> findAll();

    List<AlimentSinistre> findRange(int[] range);

    int count();
    
}
