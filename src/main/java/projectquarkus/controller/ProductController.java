package projectquarkus.controller;

import projectquarkus.model.Product;
import projectquarkus.service.ProductService;

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
    ProductService productService;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Product> getProduts(){
        return productService.getProduts();
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    public void addProduct(Product p){
        productService.addProduct(p);
    }
}
