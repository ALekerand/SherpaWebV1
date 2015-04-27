/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Nationalite;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface NationaliteFacadeLocal {

    void create(Nationalite nationalite);

    void edit(Nationalite nationalite);

    void remove(Nationalite nationalite);

    Nationalite find(Object id);

    List<Nationalite> findAll();

    List<Nationalite> findRange(int[] range);

    int count();
    
}
