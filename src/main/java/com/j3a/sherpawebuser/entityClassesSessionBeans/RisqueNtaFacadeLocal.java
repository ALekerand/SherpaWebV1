/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.RisqueNta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface RisqueNtaFacadeLocal {

    void create(RisqueNta risqueNta);

    void edit(RisqueNta risqueNta);

    void remove(RisqueNta risqueNta);

    RisqueNta find(Object id);

    List<RisqueNta> findAll();

    List<RisqueNta> findRange(int[] range);

    int count();
    
}
