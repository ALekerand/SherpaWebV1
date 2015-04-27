/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Garantie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieFacadeLocal {

    void create(Garantie garantie);

    void edit(Garantie garantie);

    void remove(Garantie garantie);

    Garantie find(Object id);

    List<Garantie> findAll();

    List<Garantie> findRange(int[] range);

    int count();
    
}
