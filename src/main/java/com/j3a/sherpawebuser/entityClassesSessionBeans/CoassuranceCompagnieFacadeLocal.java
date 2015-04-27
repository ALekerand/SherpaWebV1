/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.CoassuranceCompagnie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CoassuranceCompagnieFacadeLocal {

    void create(CoassuranceCompagnie coassuranceCompagnie);

    void edit(CoassuranceCompagnie coassuranceCompagnie);

    void remove(CoassuranceCompagnie coassuranceCompagnie);

    CoassuranceCompagnie find(Object id);

    List<CoassuranceCompagnie> findAll();

    List<CoassuranceCompagnie> findRange(int[] range);

    int count();
    
}
