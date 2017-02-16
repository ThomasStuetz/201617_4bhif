package at.htl.landwirtschaft.business;

import at.htl.landwirtschaft.entity.Feld;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Startup
@Singleton
public class InitBean {

    @Inject
    FeldFacade feldFacade;

    public InitBean() {
    }

    @PostConstruct
    private void init() {
        Feld kleinesFeld = new Feld("kleines Feld");
        feldFacade.save(kleinesFeld);
    }
}
