/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ReglementSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ReglementSinistreFacadeLocal {

    void create(ReglementSinistre reglementSinistre);

    void edit(ReglementSinistre reglementSinistre);

    void remove(ReglementSinistre reglementSinistre);

    ReglementSinistre find(Object id);

    List<ReglementSinistre> findAll();

    List<ReglementSinistre> findRange(int[] range);

    int count();
    
}
