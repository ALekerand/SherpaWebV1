/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc1;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc1FacadeLocal {

    void create(Etatc1 etatc1);

    void edit(Etatc1 etatc1);

    void remove(Etatc1 etatc1);

    Etatc1 find(Object id);

    List<Etatc1> findAll();

    List<Etatc1> findRange(int[] range);

    int count();
    
}
