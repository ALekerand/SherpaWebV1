/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AffilieListeAffilie;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AffilieListeAffilieFacadeLocal {

    void create(AffilieListeAffilie affilieListeAffilie);

    void edit(AffilieListeAffilie affilieListeAffilie);

    void remove(AffilieListeAffilie affilieListeAffilie);

    AffilieListeAffilie find(Object id);

    List<AffilieListeAffilie> findAll();

    List<AffilieListeAffilie> findRange(int[] range);

    int count();
    
}
