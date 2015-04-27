/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ApporteurAdherent;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ApporteurAdherentFacadeLocal {

    void create(ApporteurAdherent apporteurAdherent);

    void edit(ApporteurAdherent apporteurAdherent);

    void remove(ApporteurAdherent apporteurAdherent);

    ApporteurAdherent find(Object id);

    List<ApporteurAdherent> findAll();

    List<ApporteurAdherent> findRange(int[] range);

    int count();
    
}
