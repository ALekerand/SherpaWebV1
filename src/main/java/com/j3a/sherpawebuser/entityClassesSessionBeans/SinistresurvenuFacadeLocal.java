/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Sinistresurvenu;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface SinistresurvenuFacadeLocal {

    void create(Sinistresurvenu sinistresurvenu);

    void edit(Sinistresurvenu sinistresurvenu);

    void remove(Sinistresurvenu sinistresurvenu);

    Sinistresurvenu find(Object id);

    List<Sinistresurvenu> findAll();

    List<Sinistresurvenu> findRange(int[] range);

    int count();
    
}
