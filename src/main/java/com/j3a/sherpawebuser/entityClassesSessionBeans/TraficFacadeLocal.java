/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Trafic;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface TraficFacadeLocal {

    void create(Trafic trafic);

    void edit(Trafic trafic);

    void remove(Trafic trafic);

    Trafic find(Object id);

    List<Trafic> findAll();

    List<Trafic> findRange(int[] range);

    int count();
    
}
