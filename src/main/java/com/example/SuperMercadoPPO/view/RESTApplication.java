package com.example.SuperMercadoPPO.view;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@Path("/mercado")
public class RESTApplication{

    @GET
    @Produces("text/plain")
    public String teste( ) {
        return "Hola qué tal";
    }

}
