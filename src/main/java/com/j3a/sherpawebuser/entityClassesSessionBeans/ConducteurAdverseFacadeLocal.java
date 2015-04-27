/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ConducteurAdverse;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ConducteurAdverseFacadeLocal {

    void create(ConducteurAdverse conducteurAdverse);

    void edit(ConducteurAdverse conducteurAdverse);

    void remove(ConducteurAdverse conducteurAdverse);

    ConducteurAdverse find(Object id);

    List<ConducteurAdverse> findAll();

    List<ConducteurAdverse> findRange(int[] range);

    int count();
    
}
