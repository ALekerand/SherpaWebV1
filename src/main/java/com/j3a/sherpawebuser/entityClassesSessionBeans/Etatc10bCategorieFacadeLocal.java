/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc10bCategorie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc10bCategorieFacadeLocal {

    void create(Etatc10bCategorie etatc10bCategorie);

    void edit(Etatc10bCategorie etatc10bCategorie);

    void remove(Etatc10bCategorie etatc10bCategorie);

    Etatc10bCategorie find(Object id);

    List<Etatc10bCategorie> findAll();

    List<Etatc10bCategorie> findRange(int[] range);

    int count();
    
}
