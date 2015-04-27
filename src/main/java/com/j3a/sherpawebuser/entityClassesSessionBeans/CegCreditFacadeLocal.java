/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.CegCredit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface CegCreditFacadeLocal {

    void create(CegCredit cegCredit);

    void edit(CegCredit cegCredit);

    void remove(CegCredit cegCredit);

    CegCredit find(Object id);

    List<CegCredit> findAll();

    List<CegCredit> findRange(int[] range);

    int count();
    
}
