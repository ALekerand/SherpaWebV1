/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AvTrafic;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AvTraficFacadeLocal {

    void create(AvTrafic avTrafic);

    void edit(AvTrafic avTrafic);

    void remove(AvTrafic avTrafic);

    AvTrafic find(Object id);

    List<AvTrafic> findAll();

    List<AvTrafic> findRange(int[] range);

    int count();
    
}
