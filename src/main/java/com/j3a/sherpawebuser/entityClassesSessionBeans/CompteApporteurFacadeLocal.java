/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.CompteApporteur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CompteApporteurFacadeLocal {

    void create(CompteApporteur compteApporteur);

    void edit(CompteApporteur compteApporteur);

    void remove(CompteApporteur compteApporteur);

    CompteApporteur find(Object id);

    List<CompteApporteur> findAll();

    List<CompteApporteur> findRange(int[] range);

    int count();
    
}
