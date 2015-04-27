/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ActeMedical;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ActeMedicalFacadeLocal {

    void create(ActeMedical acteMedical);

    void edit(ActeMedical acteMedical);

    void remove(ActeMedical acteMedical);

    ActeMedical find(Object id);

    List<ActeMedical> findAll();

    List<ActeMedical> findRange(int[] range);

    int count();
    
}
