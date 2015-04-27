/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.PointVente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PointVenteFacadeLocal {

    void create(PointVente pointVente);

    void edit(PointVente pointVente);

    void remove(PointVente pointVente);

    PointVente find(Object id);

    List<PointVente> findAll();

    List<PointVente> findRange(int[] range);

    int count();
    
}
