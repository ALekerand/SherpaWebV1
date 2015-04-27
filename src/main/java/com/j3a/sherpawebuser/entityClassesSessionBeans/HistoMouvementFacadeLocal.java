/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.HistoMouvement;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface HistoMouvementFacadeLocal {

    void create(HistoMouvement histoMouvement);

    void edit(HistoMouvement histoMouvement);

    void remove(HistoMouvement histoMouvement);

    HistoMouvement find(Object id);

    List<HistoMouvement> findAll();

    List<HistoMouvement> findRange(int[] range);

    int count();
    
}
