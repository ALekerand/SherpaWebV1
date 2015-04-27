/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.CorpsSinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CorpsSinistreFacadeLocal {

    void create(CorpsSinistre corpsSinistre);

    void edit(CorpsSinistre corpsSinistre);

    void remove(CorpsSinistre corpsSinistre);

    CorpsSinistre find(Object id);

    List<CorpsSinistre> findAll();

    List<CorpsSinistre> findRange(int[] range);

    int count();
    
}
