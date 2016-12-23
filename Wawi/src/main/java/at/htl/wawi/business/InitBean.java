package at.htl.wawi.business;


import at.htl.wawi.entity.Order;
import at.htl.wawi.entity.Product;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.time.LocalDate;

@Singleton
@Startup
public class InitBean {

    @Inject
    ProductFacade productFacade;

    @Inject
    OrderFacade orderFacade;

    @PostConstruct
    private void init() {

        Product brot = new Product("Brot");
        Product milch = new Product("Milch");
        Product butter = new Product("Butter");

//        productFacade.save(brot);
        productFacade.save(milch);
        productFacade.save(butter);

        orderFacade.save(
                new Order(LocalDate.now(), brot)
        );

    }

}
