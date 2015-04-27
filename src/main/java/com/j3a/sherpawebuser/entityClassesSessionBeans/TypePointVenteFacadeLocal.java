/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.TypePointVente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface TypePointVenteFacadeLocal {

    void create(TypePointVente typePointVente);

    void edit(TypePointVente typePointVente);

    void remove(TypePointVente typePointVente);

    TypePointVente find(Object id);

    List<TypePointVente> findAll();

    List<TypePointVente> findRange(int[] range);

    int count();
    
}
