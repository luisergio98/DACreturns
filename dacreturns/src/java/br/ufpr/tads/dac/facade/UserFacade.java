/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tads.dac.facade;

import br.ufpr.tads.dac.beans.AdministradorBean;

/**
 *
 * @author luis_
 */
public interface UserFacade {
    
    public AdministradorBean loginAdmin (AdministradorBean admin);
    
}
