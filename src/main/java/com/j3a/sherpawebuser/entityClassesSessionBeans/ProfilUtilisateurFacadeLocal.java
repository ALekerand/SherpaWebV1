/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ProfilUtilisateur;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ProfilUtilisateurFacadeLocal {

    void create(ProfilUtilisateur profilUtilisateur);

    void edit(ProfilUtilisateur profilUtilisateur);

    void remove(ProfilUtilisateur profilUtilisateur);

    ProfilUtilisateur find(Object id);

    List<ProfilUtilisateur> findAll();

    List<ProfilUtilisateur> findRange(int[] range);

    int count();
    
}
