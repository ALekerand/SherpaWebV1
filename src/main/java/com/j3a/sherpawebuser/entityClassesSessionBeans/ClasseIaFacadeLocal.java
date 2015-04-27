/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ClasseIa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ClasseIaFacadeLocal {

    void create(ClasseIa classeIa);

    void edit(ClasseIa classeIa);

    void remove(ClasseIa classeIa);

    ClasseIa find(Object id);

    List<ClasseIa> findAll();

    List<ClasseIa> findRange(int[] range);

    int count();
    
}
