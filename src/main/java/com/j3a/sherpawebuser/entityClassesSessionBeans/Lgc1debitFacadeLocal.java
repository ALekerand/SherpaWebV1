/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.Lgc1debit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface Lgc1debitFacadeLocal {

    void create(Lgc1debit lgc1debit);

    void edit(Lgc1debit lgc1debit);

    void remove(Lgc1debit lgc1debit);

    Lgc1debit find(Object id);

    List<Lgc1debit> findAll();

    List<Lgc1debit> findRange(int[] range);

    int count();
    
}
