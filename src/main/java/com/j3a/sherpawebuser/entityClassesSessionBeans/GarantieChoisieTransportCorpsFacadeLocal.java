/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieTransportCorps;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieChoisieTransportCorpsFacadeLocal {

    void create(GarantieChoisieTransportCorps garantieChoisieTransportCorps);

    void edit(GarantieChoisieTransportCorps garantieChoisieTransportCorps);

    void remove(GarantieChoisieTransportCorps garantieChoisieTransportCorps);

    GarantieChoisieTransportCorps find(Object id);

    List<GarantieChoisieTransportCorps> findAll();

    List<GarantieChoisieTransportCorps> findRange(int[] range);

    int count();
    
}
