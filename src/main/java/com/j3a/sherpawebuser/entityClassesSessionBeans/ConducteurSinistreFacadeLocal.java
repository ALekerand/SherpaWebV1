/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ConducteurSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ConducteurSinistreFacadeLocal {

    void create(ConducteurSinistre conducteurSinistre);

    void edit(ConducteurSinistre conducteurSinistre);

    void remove(ConducteurSinistre conducteurSinistre);

    ConducteurSinistre find(Object id);

    List<ConducteurSinistre> findAll();

    List<ConducteurSinistre> findRange(int[] range);

    int count();
    
}
