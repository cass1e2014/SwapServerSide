package com.swap.common.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class SwapContainerRequestFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext arg0) throws IOException {
		System.out.println("Inside container request filter");
	}

}
