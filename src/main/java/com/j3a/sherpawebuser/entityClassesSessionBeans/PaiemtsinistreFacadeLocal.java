/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Paiemtsinistre;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface PaiemtsinistreFacadeLocal {

    void create(Paiemtsinistre paiemtsinistre);

    void edit(Paiemtsinistre paiemtsinistre);

    void remove(Paiemtsinistre paiemtsinistre);

    Paiemtsinistre find(Object id);

    List<Paiemtsinistre> findAll();

    List<Paiemtsinistre> findRange(int[] range);

    int count();
    
}
