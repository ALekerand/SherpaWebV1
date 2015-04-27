/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieSante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieChoisieSanteFacadeLocal {

    void create(GarantieChoisieSante garantieChoisieSante);

    void edit(GarantieChoisieSante garantieChoisieSante);

    void remove(GarantieChoisieSante garantieChoisieSante);

    GarantieChoisieSante find(Object id);

    List<GarantieChoisieSante> findAll();

    List<GarantieChoisieSante> findRange(int[] range);

    int count();
    
}
