/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Recours;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface RecoursFacadeLocal {

    void create(Recours recours);

    void edit(Recours recours);

    void remove(Recours recours);

    Recours find(Object id);

    List<Recours> findAll();

    List<Recours> findRange(int[] range);

    int count();
    
}
