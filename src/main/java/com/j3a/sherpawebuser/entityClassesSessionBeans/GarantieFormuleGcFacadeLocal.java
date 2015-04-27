/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.entityClassesSessionBeans;

import com.j3a.sherpawebuser.dbEntityClasses.GarantieFormuleGc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author J3A-AFRIQUE
 */
@Local
public interface GarantieFormuleGcFacadeLocal {

    void create(GarantieFormuleGc garantieFormuleGc);

    void edit(GarantieFormuleGc garantieFormuleGc);

    void remove(GarantieFormuleGc garantieFormuleGc);

    GarantieFormuleGc find(Object id);

    List<GarantieFormuleGc> findAll();

    List<GarantieFormuleGc> findRange(int[] range);

    int count();
    
}
