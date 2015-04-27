/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.EtatCima;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface EtatCimaFacadeLocal {

    void create(EtatCima etatCima);

    void edit(EtatCima etatCima);

    void remove(EtatCima etatCima);

    EtatCima find(Object id);

    List<EtatCima> findAll();

    List<EtatCima> findRange(int[] range);

    int count();
    
}
