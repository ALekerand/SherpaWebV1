/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Lgc1credit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Lgc1creditFacadeLocal {

    void create(Lgc1credit lgc1credit);

    void edit(Lgc1credit lgc1credit);

    void remove(Lgc1credit lgc1credit);

    Lgc1credit find(Object id);

    List<Lgc1credit> findAll();

    List<Lgc1credit> findRange(int[] range);

    int count();
    
}
