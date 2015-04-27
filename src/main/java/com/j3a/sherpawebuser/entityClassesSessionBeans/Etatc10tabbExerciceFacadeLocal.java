/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc10tabbExercice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc10tabbExerciceFacadeLocal {

    void create(Etatc10tabbExercice etatc10tabbExercice);

    void edit(Etatc10tabbExercice etatc10tabbExercice);

    void remove(Etatc10tabbExercice etatc10tabbExercice);

    Etatc10tabbExercice find(Object id);

    List<Etatc10tabbExercice> findAll();

    List<Etatc10tabbExercice> findRange(int[] range);

    int count();
    
}
