/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.RisqueNtaSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface RisqueNtaSinistreFacadeLocal {

    void create(RisqueNtaSinistre risqueNtaSinistre);

    void edit(RisqueNtaSinistre risqueNtaSinistre);

    void remove(RisqueNtaSinistre risqueNtaSinistre);

    RisqueNtaSinistre find(Object id);

    List<RisqueNtaSinistre> findAll();

    List<RisqueNtaSinistre> findRange(int[] range);

    int count();
    
}
