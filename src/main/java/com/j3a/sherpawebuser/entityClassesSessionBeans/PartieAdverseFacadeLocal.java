/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.PartieAdverse;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PartieAdverseFacadeLocal {

    void create(PartieAdverse partieAdverse);

    void edit(PartieAdverse partieAdverse);

    void remove(PartieAdverse partieAdverse);

    PartieAdverse find(Object id);

    List<PartieAdverse> findAll();

    List<PartieAdverse> findRange(int[] range);

    int count();
    
}
