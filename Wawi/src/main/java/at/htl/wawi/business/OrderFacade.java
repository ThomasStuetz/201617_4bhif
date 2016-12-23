package at.htl.wawi.business;

import at.htl.wawi.entity.Order;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OrderFacade {

    @PersistenceContext
    EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }
}
