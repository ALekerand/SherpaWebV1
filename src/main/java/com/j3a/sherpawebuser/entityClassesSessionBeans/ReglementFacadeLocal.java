/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Reglement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ReglementFacadeLocal {

    void create(Reglement reglement);

    void edit(Reglement reglement);

    void remove(Reglement reglement);

    Reglement find(Object id);

    List<Reglement> findAll();

    List<Reglement> findRange(int[] range);

    int count();
    
}
