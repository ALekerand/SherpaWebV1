/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AdherentsSante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AdherentsSanteFacadeLocal {

    void create(AdherentsSante adherentsSante);

    void edit(AdherentsSante adherentsSante);

    void remove(AdherentsSante adherentsSante);

    AdherentsSante find(Object id);

    List<AdherentsSante> findAll();

    List<AdherentsSante> findRange(int[] range);

    int count();
    
}
