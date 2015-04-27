/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Expertise;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ExpertiseFacadeLocal {

    void create(Expertise expertise);

    void edit(Expertise expertise);

    void remove(Expertise expertise);

    Expertise find(Object id);

    List<Expertise> findAll();

    List<Expertise> findRange(int[] range);

    int count();
    
}
