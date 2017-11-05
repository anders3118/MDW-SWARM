package com.solutionsaa.swarm.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/hello")
public class HelloWorldEndpoint {

	@GET
	@Produces("application/json")
	public Response doGet() {
		return Response.ok("{saludo : \"hola este es un saludo \" }").build();
	}
}