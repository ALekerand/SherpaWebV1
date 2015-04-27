/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Province;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface ProvinceFacadeLocal {

    void create(Province province);

    void edit(Province province);

    void remove(Province province);

    Province find(Object id);

    List<Province> findAll();

    List<Province> findRange(int[] range);

    int count();
    
}
