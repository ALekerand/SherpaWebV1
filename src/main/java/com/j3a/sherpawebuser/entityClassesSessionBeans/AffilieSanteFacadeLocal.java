/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AffilieSante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AffilieSanteFacadeLocal {

    void create(AffilieSante affilieSante);

    void edit(AffilieSante affilieSante);

    void remove(AffilieSante affilieSante);

    AffilieSante find(Object id);

    List<AffilieSante> findAll();

    List<AffilieSante> findRange(int[] range);

    int count();
    
}
