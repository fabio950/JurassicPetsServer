/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.repository.CategoriaDAOLocal;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 *
 * @author fabio
 */
@Stateless
public class CategoriaService implements CategoriaServiceLocal {

    @EJB
    private CategoriaDAOLocal categoriaDAO;

    @Resource
    private SessionContext contexto;
    
    @Override
    public List listCategorias() {
        try{
            return categoriaDAO.listCategorias();
        } catch(Exception e){
            contexto.setRollbackOnly();
            e.printStackTrace();
            return null;
        }
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
