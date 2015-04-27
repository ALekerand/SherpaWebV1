/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Vente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface VenteFacadeLocal {

    void create(Vente vente);

    void edit(Vente vente);

    void remove(Vente vente);

    Vente find(Object id);

    List<Vente> findAll();

    List<Vente> findRange(int[] range);

    int count();
    
}
