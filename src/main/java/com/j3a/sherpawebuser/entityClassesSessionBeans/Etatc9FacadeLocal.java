/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc9;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc9FacadeLocal {

    void create(Etatc9 etatc9);

    void edit(Etatc9 etatc9);

    void remove(Etatc9 etatc9);

    Etatc9 find(Object id);

    List<Etatc9> findAll();

    List<Etatc9> findRange(int[] range);

    int count();
    
}
