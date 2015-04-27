/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.ListeTrafic;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ListeTraficFacadeLocal {

    void create(ListeTrafic listeTrafic);

    void edit(ListeTrafic listeTrafic);

    void remove(ListeTrafic listeTrafic);

    ListeTrafic find(Object id);

    List<ListeTrafic> findAll();

    List<ListeTrafic> findRange(int[] range);

    int count();
    
}
