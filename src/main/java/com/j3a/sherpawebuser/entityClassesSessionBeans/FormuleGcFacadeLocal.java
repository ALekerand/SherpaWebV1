/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.FormuleGc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface FormuleGcFacadeLocal {

    void create(FormuleGc formuleGc);

    void edit(FormuleGc formuleGc);

    void remove(FormuleGc formuleGc);

    FormuleGc find(Object id);

    List<FormuleGc> findAll();

    List<FormuleGc> findRange(int[] range);

    int count();
    
}
