/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieCorps;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieGarantieChoisieCorpsFacadeLocal {

    void create(GarantieGarantieChoisieCorps garantieGarantieChoisieCorps);

    void edit(GarantieGarantieChoisieCorps garantieGarantieChoisieCorps);

    void remove(GarantieGarantieChoisieCorps garantieGarantieChoisieCorps);

    GarantieGarantieChoisieCorps find(Object id);

    List<GarantieGarantieChoisieCorps> findAll();

    List<GarantieGarantieChoisieCorps> findRange(int[] range);

    int count();
    
}
