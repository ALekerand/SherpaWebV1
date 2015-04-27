/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ReassuranceCompagnie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ReassuranceCompagnieFacadeLocal {

    void create(ReassuranceCompagnie reassuranceCompagnie);

    void edit(ReassuranceCompagnie reassuranceCompagnie);

    void remove(ReassuranceCompagnie reassuranceCompagnie);

    ReassuranceCompagnie find(Object id);

    List<ReassuranceCompagnie> findAll();

    List<ReassuranceCompagnie> findRange(int[] range);

    int count();
    
}
