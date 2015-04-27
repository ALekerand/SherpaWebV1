/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.CollegeSante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CollegeSanteFacadeLocal {

    void create(CollegeSante collegeSante);

    void edit(CollegeSante collegeSante);

    void remove(CollegeSante collegeSante);

    CollegeSante find(Object id);

    List<CollegeSante> findAll();

    List<CollegeSante> findRange(int[] range);

    int count();
    
}
