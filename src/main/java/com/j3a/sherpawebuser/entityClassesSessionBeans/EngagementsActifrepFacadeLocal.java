/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.EngagementsActifrep;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface EngagementsActifrepFacadeLocal {

    void create(EngagementsActifrep engagementsActifrep);

    void edit(EngagementsActifrep engagementsActifrep);

    void remove(EngagementsActifrep engagementsActifrep);

    EngagementsActifrep find(Object id);

    List<EngagementsActifrep> findAll();

    List<EngagementsActifrep> findRange(int[] range);

    int count();
    
}
