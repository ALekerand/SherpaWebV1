/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieTransport;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieChoisieTransportFacadeLocal {

    void create(GarantieChoisieTransport garantieChoisieTransport);

    void edit(GarantieChoisieTransport garantieChoisieTransport);

    void remove(GarantieChoisieTransport garantieChoisieTransport);

    GarantieChoisieTransport find(Object id);

    List<GarantieChoisieTransport> findAll();

    List<GarantieChoisieTransport> findRange(int[] range);

    int count();
    
}
