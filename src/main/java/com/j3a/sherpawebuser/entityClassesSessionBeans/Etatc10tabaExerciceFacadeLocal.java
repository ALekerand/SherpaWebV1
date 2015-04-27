/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc10tabaExercice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc10tabaExerciceFacadeLocal {

    void create(Etatc10tabaExercice etatc10tabaExercice);

    void edit(Etatc10tabaExercice etatc10tabaExercice);

    void remove(Etatc10tabaExercice etatc10tabaExercice);

    Etatc10tabaExercice find(Object id);

    List<Etatc10tabaExercice> findAll();

    List<Etatc10tabaExercice> findRange(int[] range);

    int count();
    
}
