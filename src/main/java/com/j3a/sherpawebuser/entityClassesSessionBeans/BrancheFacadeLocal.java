/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Branche;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface BrancheFacadeLocal {

    void create(Branche branche);

    void edit(Branche branche);

    void remove(Branche branche);

    Branche find(Object id);

    List<Branche> findAll();

    List<Branche> findRange(int[] range);

    int count();
    
}
