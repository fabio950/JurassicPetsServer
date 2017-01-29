/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;

import com.mycompany.domain.Categoria;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fabio
 */
@Stateless
public class CategoriaDAO implements CategoriaDAOLocal {

    @PersistenceContext(unitName = "jurassicpetsserverPU")
    EntityManager em;
    
    @Override
    public List listCategorias() {
        List<Categoria> categorias = em.createNamedQuery("Categoria.findAll").getResultList();
        return categorias;
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
