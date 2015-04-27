/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Feuillebilan;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface FeuillebilanFacadeLocal {

    void create(Feuillebilan feuillebilan);

    void edit(Feuillebilan feuillebilan);

    void remove(Feuillebilan feuillebilan);

    Feuillebilan find(Object id);

    List<Feuillebilan> findAll();

    List<Feuillebilan> findRange(int[] range);

    int count();
    
}
