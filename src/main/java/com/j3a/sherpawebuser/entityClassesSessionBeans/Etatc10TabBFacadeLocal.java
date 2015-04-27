/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc10TabB;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc10TabBFacadeLocal {

    void create(Etatc10TabB etatc10TabB);

    void edit(Etatc10TabB etatc10TabB);

    void remove(Etatc10TabB etatc10TabB);

    Etatc10TabB find(Object id);

    List<Etatc10TabB> findAll();

    List<Etatc10TabB> findRange(int[] range);

    int count();
    
}
