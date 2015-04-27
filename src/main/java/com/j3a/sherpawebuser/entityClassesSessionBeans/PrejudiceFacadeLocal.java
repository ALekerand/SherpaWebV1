/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Prejudice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PrejudiceFacadeLocal {

    void create(Prejudice prejudice);

    void edit(Prejudice prejudice);

    void remove(Prejudice prejudice);

    Prejudice find(Object id);

    List<Prejudice> findAll();

    List<Prejudice> findRange(int[] range);

    int count();
    
}
