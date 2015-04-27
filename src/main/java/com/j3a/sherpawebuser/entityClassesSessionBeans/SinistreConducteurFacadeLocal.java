/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.SinistreConducteur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface SinistreConducteurFacadeLocal {

    void create(SinistreConducteur sinistreConducteur);

    void edit(SinistreConducteur sinistreConducteur);

    void remove(SinistreConducteur sinistreConducteur);

    SinistreConducteur find(Object id);

    List<SinistreConducteur> findAll();

    List<SinistreConducteur> findRange(int[] range);

    int count();
    
}
