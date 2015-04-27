/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Cgpp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CgppFacadeLocal {

    void create(Cgpp cgpp);

    void edit(Cgpp cgpp);

    void remove(Cgpp cgpp);

    Cgpp find(Object id);

    List<Cgpp> findAll();

    List<Cgpp> findRange(int[] range);

    int count();
    
}
