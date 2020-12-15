package com.example.SuperMercadoPPO.view;

import com.example.SuperMercadoPPO.controller.ClienteDAO;
import jdk.nashorn.internal.runtime.JSONListAdapter;
import com.google.gson.Gson;
import org.ietf.jgss.GSSContext;

import javax.ws.rs.*;

@Path("/cliente")
public class ClienteRoutes {

    @GET
    @Produces("application/json")
    public String getAllCLientes() {
        ClienteDAO clienteDAO = new ClienteDAO();
        Gson gson = new Gson();
        return gson.toJson(clienteDAO.getClientes());
    }

    @GET
    @Produces("application/json")
    @Consumes("application/json")
    @Path("{id}")
    public String getClienteById() {
        return "{that's it brow}";
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public String insertNewCliente() {

        return "{message:'cliente inserido com sucesso !!'}";
    }

    @PUT
    @Produces("application/json")
    public String updateCliente() {
        return "{message:'cliente alterado com sucesso !!'}";
    }

    @DELETE
    @Produces("application/json")
    public String deleteCliente() {
        return "{message:'cliente excluido com sucesso !!'}";
    }

}