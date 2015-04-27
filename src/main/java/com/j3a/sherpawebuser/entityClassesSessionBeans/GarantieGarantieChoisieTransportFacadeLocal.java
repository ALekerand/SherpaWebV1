/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieTransport;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieGarantieChoisieTransportFacadeLocal {

    void create(GarantieGarantieChoisieTransport garantieGarantieChoisieTransport);

    void edit(GarantieGarantieChoisieTransport garantieGarantieChoisieTransport);

    void remove(GarantieGarantieChoisieTransport garantieGarantieChoisieTransport);

    GarantieGarantieChoisieTransport find(Object id);

    List<GarantieGarantieChoisieTransport> findAll();

    List<GarantieGarantieChoisieTransport> findRange(int[] range);

    int count();
    
}
