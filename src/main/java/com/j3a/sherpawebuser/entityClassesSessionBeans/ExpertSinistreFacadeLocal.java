/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ExpertSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ExpertSinistreFacadeLocal {

    void create(ExpertSinistre expertSinistre);

    void edit(ExpertSinistre expertSinistre);

    void remove(ExpertSinistre expertSinistre);

    ExpertSinistre find(Object id);

    List<ExpertSinistre> findAll();

    List<ExpertSinistre> findRange(int[] range);

    int count();
    
}
