package org.meetup.openshift.rhoar.customers.exception.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.meetup.openshift.rhoar.customers.exception.ResourceNotFoundException;

@Provider
public class ResourceNotFoundExceptionHandler implements ExceptionMapper<ResourceNotFoundException>{

	public Response toResponse(ResourceNotFoundException ex) {
		
		return Response.status(Status.NOT_FOUND).entity(Status.NOT_FOUND.getStatusCode() + " - " + ex.getMessage()).build();
	}

}
