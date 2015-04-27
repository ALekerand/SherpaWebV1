/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Accords;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AccordsFacadeLocal {

    void create(Accords accords);

    void edit(Accords accords);

    void remove(Accords accords);

    Accords find(Object id);

    List<Accords> findAll();

    List<Accords> findRange(int[] range);

    int count();
    
}
