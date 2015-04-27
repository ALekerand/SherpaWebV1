/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieNta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieChoisieNtaFacadeLocal {

    void create(GarantieChoisieNta garantieChoisieNta);

    void edit(GarantieChoisieNta garantieChoisieNta);

    void remove(GarantieChoisieNta garantieChoisieNta);

    GarantieChoisieNta find(Object id);

    List<GarantieChoisieNta> findAll();

    List<GarantieChoisieNta> findRange(int[] range);

    int count();
    
}
