/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc10b;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc10bFacadeLocal {

    void create(Etatc10b etatc10b);

    void edit(Etatc10b etatc10b);

    void remove(Etatc10b etatc10b);

    Etatc10b find(Object id);

    List<Etatc10b> findAll();

    List<Etatc10b> findRange(int[] range);

    int count();
    
}
