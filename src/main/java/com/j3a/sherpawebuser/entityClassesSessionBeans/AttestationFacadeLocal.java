/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Attestation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AttestationFacadeLocal {

    void create(Attestation attestation);

    void edit(Attestation attestation);

    void remove(Attestation attestation);

    Attestation find(Object id);

    List<Attestation> findAll();

    List<Attestation> findRange(int[] range);

    int count();
    
}
