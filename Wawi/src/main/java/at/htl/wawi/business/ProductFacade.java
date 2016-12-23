package at.htl.wawi.business;

import at.htl.wawi.entity.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class ProductFacade {

    @PersistenceContext
    EntityManager em;

    public void save(Product product) {
        em.persist(product);
    }

    public List<Product> findAll() {

        TypedQuery<Product> query = em
                .createQuery("select p from Product p", Product.class);
        return query.getResultList();
    }

}
