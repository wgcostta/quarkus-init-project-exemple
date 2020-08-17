package org.my.group.controller;

import org.my.group.model.Product;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/product")
public class ProductController {

    @Inject
    EntityManager entityManager;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Product> getProduts(){
        return entityManager.createQuery("select * from Produto", Product.class).getResultList();
    }
}
