/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ActionnaireConseil;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ActionnaireConseilFacadeLocal {

    void create(ActionnaireConseil actionnaireConseil);

    void edit(ActionnaireConseil actionnaireConseil);

    void remove(ActionnaireConseil actionnaireConseil);

    ActionnaireConseil find(Object id);

    List<ActionnaireConseil> findAll();

    List<ActionnaireConseil> findRange(int[] range);

    int count();
    
}
