/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AssureIaSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AssureIaSinistreFacadeLocal {

    void create(AssureIaSinistre assureIaSinistre);

    void edit(AssureIaSinistre assureIaSinistre);

    void remove(AssureIaSinistre assureIaSinistre);

    AssureIaSinistre find(Object id);

    List<AssureIaSinistre> findAll();

    List<AssureIaSinistre> findRange(int[] range);

    int count();
    
}
