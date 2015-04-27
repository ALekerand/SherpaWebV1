/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Sexe;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface SexeFacadeLocal {

    void create(Sexe sexe);

    void edit(Sexe sexe);

    void remove(Sexe sexe);

    Sexe find(Object id);

    List<Sexe> findAll();

    List<Sexe> findRange(int[] range);

    int count();
    
}
