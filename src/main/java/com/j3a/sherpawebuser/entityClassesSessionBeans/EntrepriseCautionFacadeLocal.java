/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.EntrepriseCaution;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface EntrepriseCautionFacadeLocal {

    void create(EntrepriseCaution entrepriseCaution);

    void edit(EntrepriseCaution entrepriseCaution);

    void remove(EntrepriseCaution entrepriseCaution);

    EntrepriseCaution find(Object id);

    List<EntrepriseCaution> findAll();

    List<EntrepriseCaution> findRange(int[] range);

    int count();
    
}
