/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ClasseGc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ClasseGcFacadeLocal {

    void create(ClasseGc classeGc);

    void edit(ClasseGc classeGc);

    void remove(ClasseGc classeGc);

    ClasseGc find(Object id);

    List<ClasseGc> findAll();

    List<ClasseGc> findRange(int[] range);

    int count();
    
}
