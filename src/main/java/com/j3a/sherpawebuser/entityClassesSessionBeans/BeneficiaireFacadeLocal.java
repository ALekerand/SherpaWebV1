/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Beneficiaire;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface BeneficiaireFacadeLocal {

    void create(Beneficiaire beneficiaire);

    void edit(Beneficiaire beneficiaire);

    void remove(Beneficiaire beneficiaire);

    Beneficiaire find(Object id);

    List<Beneficiaire> findAll();

    List<Beneficiaire> findRange(int[] range);

    int count();
    
}
