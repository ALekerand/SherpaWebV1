/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.C10Exercice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface C10ExerciceFacadeLocal {

    void create(C10Exercice c10Exercice);

    void edit(C10Exercice c10Exercice);

    void remove(C10Exercice c10Exercice);

    C10Exercice find(Object id);

    List<C10Exercice> findAll();

    List<C10Exercice> findRange(int[] range);

    int count();
    
}
