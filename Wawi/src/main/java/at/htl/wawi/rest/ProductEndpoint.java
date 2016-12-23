package at.htl.wawi.rest;

import at.htl.wawi.business.ProductFacade;
import at.htl.wawi.entity.Product;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("product")
public class ProductEndpoint {

    @Inject
    ProductFacade productFacade;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        List<Product> products = productFacade.findAll();
        return Response.ok().entity(products).build();
    }
}
