package com.dream.restfulapi.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {

    //日志
    public static final Logger log = LogManager.getLogger(HelloResource.class);

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        log.info("Request Start.");

        String output = "Jersey say : " + msg;

        log.info("Request End.");
        return Response.status(200).entity(output).build();

    }

}