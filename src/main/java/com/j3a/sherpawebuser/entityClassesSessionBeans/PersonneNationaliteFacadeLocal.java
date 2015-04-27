/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.PersonneNationalite;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PersonneNationaliteFacadeLocal {

    void create(PersonneNationalite personneNationalite);

    void edit(PersonneNationalite personneNationalite);

    void remove(PersonneNationalite personneNationalite);

    PersonneNationalite find(Object id);

    List<PersonneNationalite> findAll();

    List<PersonneNationalite> findRange(int[] range);

    int count();
    
}
