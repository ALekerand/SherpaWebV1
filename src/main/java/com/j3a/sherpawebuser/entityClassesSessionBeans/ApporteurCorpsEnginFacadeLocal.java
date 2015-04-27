/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ApporteurCorpsEngin;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ApporteurCorpsEnginFacadeLocal {

    void create(ApporteurCorpsEngin apporteurCorpsEngin);

    void edit(ApporteurCorpsEngin apporteurCorpsEngin);

    void remove(ApporteurCorpsEngin apporteurCorpsEngin);

    ApporteurCorpsEngin find(Object id);

    List<ApporteurCorpsEngin> findAll();

    List<ApporteurCorpsEngin> findRange(int[] range);

    int count();
    
}
