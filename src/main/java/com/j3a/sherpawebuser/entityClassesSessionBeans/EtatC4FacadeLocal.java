/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.EtatC4;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface EtatC4FacadeLocal {

    void create(EtatC4 etatC4);

    void edit(EtatC4 etatC4);

    void remove(EtatC4 etatC4);

    EtatC4 find(Object id);

    List<EtatC4> findAll();

    List<EtatC4> findRange(int[] range);

    int count();
    
}
