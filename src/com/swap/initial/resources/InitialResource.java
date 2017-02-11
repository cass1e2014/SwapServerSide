package com.swap.initial.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.swap.initial.service.InitialService;

@Path("initial")
public class InitialResource {

	@Inject
	InitialService service;
	
	@GET
	public String getSample() {
		return service.getServiceResponse();
	}
}
