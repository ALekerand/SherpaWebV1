/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc10a;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc10aFacadeLocal {

    void create(Etatc10a etatc10a);

    void edit(Etatc10a etatc10a);

    void remove(Etatc10a etatc10a);

    Etatc10a find(Object id);

    List<Etatc10a> findAll();

    List<Etatc10a> findRange(int[] range);

    int count();
    
}
