package org.my.group.controller;

import org.my.group.model.Product;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/product")
@Transactional
public class ProductController {

    @Inject
    EntityManager entityManager;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Product> getProduts(){
        return entityManager.createQuery("select p from Product p", Product.class).getResultList();
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void addProduct(Product p){
        entityManager.persist(p);
    }
}
