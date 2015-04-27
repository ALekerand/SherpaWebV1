/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Victime;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface VictimeFacadeLocal {

    void create(Victime victime);

    void edit(Victime victime);

    void remove(Victime victime);

    Victime find(Object id);

    List<Victime> findAll();

    List<Victime> findRange(int[] range);

    int count();
    
}
