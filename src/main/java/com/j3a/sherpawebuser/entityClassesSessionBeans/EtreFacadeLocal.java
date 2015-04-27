/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface EtreFacadeLocal {

    void create(Etre etre);

    void edit(Etre etre);

    void remove(Etre etre);

    Etre find(Object id);

    List<Etre> findAll();

    List<Etre> findRange(int[] range);

    int count();
    
}
