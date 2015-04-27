/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AffaireApporteur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AffaireApporteurFacadeLocal {

    void create(AffaireApporteur affaireApporteur);

    void edit(AffaireApporteur affaireApporteur);

    void remove(AffaireApporteur affaireApporteur);

    AffaireApporteur find(Object id);

    List<AffaireApporteur> findAll();

    List<AffaireApporteur> findRange(int[] range);

    int count();
    
}
