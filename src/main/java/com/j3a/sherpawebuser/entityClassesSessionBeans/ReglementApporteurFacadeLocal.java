/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ReglementApporteur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ReglementApporteurFacadeLocal {

    void create(ReglementApporteur reglementApporteur);

    void edit(ReglementApporteur reglementApporteur);

    void remove(ReglementApporteur reglementApporteur);

    ReglementApporteur find(Object id);

    List<ReglementApporteur> findAll();

    List<ReglementApporteur> findRange(int[] range);

    int count();
    
}
