/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Exercice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ExerciceFacadeLocal {

    void create(Exercice exercice);

    void edit(Exercice exercice);

    void remove(Exercice exercice);

    Exercice find(Object id);

    List<Exercice> findAll();

    List<Exercice> findRange(int[] range);

    int count();
    
}
