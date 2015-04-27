/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.PersonneCaution;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PersonneCautionFacadeLocal {

    void create(PersonneCaution personneCaution);

    void edit(PersonneCaution personneCaution);

    void remove(PersonneCaution personneCaution);

    PersonneCaution find(Object id);

    List<PersonneCaution> findAll();

    List<PersonneCaution> findRange(int[] range);

    int count();
    
}
