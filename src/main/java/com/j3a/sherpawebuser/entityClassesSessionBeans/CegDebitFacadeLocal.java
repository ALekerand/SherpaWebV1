/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.CegDebit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CegDebitFacadeLocal {

    void create(CegDebit cegDebit);

    void edit(CegDebit cegDebit);

    void remove(CegDebit cegDebit);

    CegDebit find(Object id);

    List<CegDebit> findAll();

    List<CegDebit> findRange(int[] range);

    int count();
    
}
