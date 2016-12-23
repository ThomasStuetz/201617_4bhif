package at.htl.wawi.business;


import at.htl.wawi.entity.Product;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
public class InitBean {

    @Inject
    ProductFacade productFacade;

    @PostConstruct
    private void init() {
        productFacade.save(new Product("Milch"));
        productFacade.save(new Product("Brot"));
        productFacade.save(new Product("Butter"));
        System.out.println(productFacade.findAll());

    }

}
