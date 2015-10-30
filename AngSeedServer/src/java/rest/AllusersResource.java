/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author AlexanderSteen
 */
@Path("allusers")
public class AllusersResource {

    @Context
    private UriInfo context;

    public AllusersResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUsers() {
        return Response.ok("[{\"name\": \"Jan\",\"mail\":\"jan@a.dk\"},{\"name\":\"Ann\",\"mail\":\"ann@a.dk\"},{\"name\":\"ib\",\"mail\":\"ib@a.dk\"}]").build();
    }
}
