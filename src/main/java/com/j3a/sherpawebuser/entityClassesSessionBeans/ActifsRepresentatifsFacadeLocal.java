/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ActifsRepresentatifs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ActifsRepresentatifsFacadeLocal {

    void create(ActifsRepresentatifs actifsRepresentatifs);

    void edit(ActifsRepresentatifs actifsRepresentatifs);

    void remove(ActifsRepresentatifs actifsRepresentatifs);

    ActifsRepresentatifs find(Object id);

    List<ActifsRepresentatifs> findAll();

    List<ActifsRepresentatifs> findRange(int[] range);

    int count();
    
}
