/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.tads.dac.dao;

import br.ufpr.tads.dac.beans.AdministradorBean;
import br.ufpr.tads.dac.beans.PlanoBean;
import java.util.List;

/**
 *
 * @author luis_
 */
public interface PlanoDao {
    
    public List<PlanoBean> listar ();
    public void remover (int id);
    public void inserir (PlanoBean plano);
    public PlanoBean buscar (int id);
    public void alterar (PlanoBean plano);
    
}
