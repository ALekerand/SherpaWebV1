/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.AvListeCorpsEngin;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface AvListeCorpsEnginFacadeLocal {

    void create(AvListeCorpsEngin avListeCorpsEngin);

    void edit(AvListeCorpsEngin avListeCorpsEngin);

    void remove(AvListeCorpsEngin avListeCorpsEngin);

    AvListeCorpsEngin find(Object id);

    List<AvListeCorpsEngin> findAll();

    List<AvListeCorpsEngin> findRange(int[] range);

    int count();
    
}
