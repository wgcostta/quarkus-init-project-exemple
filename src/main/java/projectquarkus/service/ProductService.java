package projectquarkus.service;

import org.eclipse.microprofile.opentracing.Traced;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import projectquarkus.model.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
@Traced
public class ProductService {

    @Inject
    EntityManager entityManager;

    //@Inject @RestClient UnidadeFederativaService ufService;

    public List<Product> getProduts(){
        return entityManager.createQuery("select p from Product p", Product.class).getResultList();
    }

    public void addProduct(Product p){
        entityManager.persist(p);
    }

}
