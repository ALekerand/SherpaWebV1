/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Intervenant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface IntervenantFacadeLocal {

    void create(Intervenant intervenant);

    void edit(Intervenant intervenant);

    void remove(Intervenant intervenant);

    Intervenant find(Object id);

    List<Intervenant> findAll();

    List<Intervenant> findRange(int[] range);

    int count();
    
}
