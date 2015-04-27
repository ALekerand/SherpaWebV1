/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AvenantRisqueNta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AvenantRisqueNtaFacadeLocal {

    void create(AvenantRisqueNta avenantRisqueNta);

    void edit(AvenantRisqueNta avenantRisqueNta);

    void remove(AvenantRisqueNta avenantRisqueNta);

    AvenantRisqueNta find(Object id);

    List<AvenantRisqueNta> findAll();

    List<AvenantRisqueNta> findRange(int[] range);

    int count();
    
}
