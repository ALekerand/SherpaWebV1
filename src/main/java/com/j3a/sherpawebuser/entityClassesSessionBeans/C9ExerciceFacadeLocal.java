/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.C9Exercice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface C9ExerciceFacadeLocal {

    void create(C9Exercice c9Exercice);

    void edit(C9Exercice c9Exercice);

    void remove(C9Exercice c9Exercice);

    C9Exercice find(Object id);

    List<C9Exercice> findAll();

    List<C9Exercice> findRange(int[] range);

    int count();
    
}
