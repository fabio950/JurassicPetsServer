/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import com.mycompany.domain.Categoria;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;

/**
 *
 * @author fabio
 */
@Path("/CategoriasService")
@Produces("application/json;charset=UTF-8")
@Consumes("application/json;charset=UTF-8")
@Stateless
public class CategoriaServiceREST {

    @EJB
    private com.mycompany.service.CategoriaServiceLocal categoriaService;
    
    @GET
    @Produces("application/json;charset=UTF-8")
    @Path("/Categorias")
    public List<Categoria> listCategorias() {
        return categoriaService.listCategorias();
    }
}
