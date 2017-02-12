package com.swap.initial.resources;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swap.initial.service.InitialService;

@Path("initial")
public class InitialResource {

	@Inject
	InitialService service;
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getSample() {
		return service.getServiceResponse();
	}
}
