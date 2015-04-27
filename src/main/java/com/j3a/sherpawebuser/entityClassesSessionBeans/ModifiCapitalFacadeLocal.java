/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ModifiCapital;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ModifiCapitalFacadeLocal {

    void create(ModifiCapital modifiCapital);

    void edit(ModifiCapital modifiCapital);

    void remove(ModifiCapital modifiCapital);

    ModifiCapital find(Object id);

    List<ModifiCapital> findAll();

    List<ModifiCapital> findRange(int[] range);

    int count();
    
}
