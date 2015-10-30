/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author AlexanderSteen
 */
@Path("footballclubs")
public class FootballclubsResource {

    @Context
    private UriInfo context;

    public FootballclubsResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getClubs() {
        return Response.ok("[{\"name\":\"Liverpool\", \"url\":\"http://www.liverpoolfc.com\"},{\"name\":\"Manchester United\",\"url\" : \"http://www.manutd.com/\"}]").build();
    }
}
