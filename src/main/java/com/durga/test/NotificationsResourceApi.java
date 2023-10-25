package com.durga.test;

import javax.management.Notification;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("/notifications")
public class NotificationsResourceApi {
    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service online").build();
        
    }

    @GET
    @Path("/post/{id}")
    public Response CreateNotification(@PathParam("id") Integer id) {
        return Response.ok()
                .entity(new Notification( "john", id, 123456))
                .build();
    }

    @POST
    @Path("/post/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createPost(Notification notification) {
        return Response.status(201).entity(notification).build();
    }
}
