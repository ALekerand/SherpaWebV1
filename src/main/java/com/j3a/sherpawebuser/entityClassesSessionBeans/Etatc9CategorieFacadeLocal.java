/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Etatc9Categorie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Etatc9CategorieFacadeLocal {

    void create(Etatc9Categorie etatc9Categorie);

    void edit(Etatc9Categorie etatc9Categorie);

    void remove(Etatc9Categorie etatc9Categorie);

    Etatc9Categorie find(Object id);

    List<Etatc9Categorie> findAll();

    List<Etatc9Categorie> findRange(int[] range);

    int count();
    
}
