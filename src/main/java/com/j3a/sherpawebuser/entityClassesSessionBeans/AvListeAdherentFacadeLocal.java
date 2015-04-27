/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AvListeAdherent;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AvListeAdherentFacadeLocal {

    void create(AvListeAdherent avListeAdherent);

    void edit(AvListeAdherent avListeAdherent);

    void remove(AvListeAdherent avListeAdherent);

    AvListeAdherent find(Object id);

    List<AvListeAdherent> findAll();

    List<AvListeAdherent> findRange(int[] range);

    int count();
    
}
