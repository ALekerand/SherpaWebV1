/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc10aCategorie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc10aCategorieFacadeLocal {

    void create(Etatc10aCategorie etatc10aCategorie);

    void edit(Etatc10aCategorie etatc10aCategorie);

    void remove(Etatc10aCategorie etatc10aCategorie);

    Etatc10aCategorie find(Object id);

    List<Etatc10aCategorie> findAll();

    List<Etatc10aCategorie> findRange(int[] range);

    int count();
    
}
