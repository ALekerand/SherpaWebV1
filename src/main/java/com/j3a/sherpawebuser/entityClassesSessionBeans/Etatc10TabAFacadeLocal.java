/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc10TabA;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc10TabAFacadeLocal {

    void create(Etatc10TabA etatc10TabA);

    void edit(Etatc10TabA etatc10TabA);

    void remove(Etatc10TabA etatc10TabA);

    Etatc10TabA find(Object id);

    List<Etatc10TabA> findAll();

    List<Etatc10TabA> findRange(int[] range);

    int count();
    
}
