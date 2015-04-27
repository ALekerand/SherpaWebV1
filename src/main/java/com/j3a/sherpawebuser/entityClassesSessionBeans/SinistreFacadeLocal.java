/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Sinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface SinistreFacadeLocal {

    void create(Sinistre sinistre);

    void edit(Sinistre sinistre);

    void remove(Sinistre sinistre);

    Sinistre find(Object id);

    List<Sinistre> findAll();

    List<Sinistre> findRange(int[] range);

    int count();
    
}
