package com.sports.cfl.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.sportsapp.cfl.dao.UserDAO;
import com.sportsapp.cfl.dto.Appuser;

@Path("/user")
public class UserResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello World User Resource!";
    }

    @SuppressWarnings("static-access")
    @GET
    @Path("/loaduser")
    @Produces({ MediaType.APPLICATION_JSON })
    public Appuser getUserById(@QueryParam("id") String id) throws Exception {
        return new UserDAO().getUserByName(id);
    }

    @SuppressWarnings("static-access")
    @GET
    @Path("/verifyUser")
    @Produces({ MediaType.APPLICATION_JSON })
    public Appuser getUserById(@QueryParam("id") String id,
            @QueryParam("password") String password) throws Exception {
        return new UserDAO().verifyUser(id, password);
    }

}
