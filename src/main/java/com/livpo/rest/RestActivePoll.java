package com.livpo.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class RestActivePoll {
	
		@GET
		@Produces("text/html")
		public Response getStartingPage()
		{
			String output = "<h1>ActivePo<h1>" +
					"<p>RESTful Service is alive & running ... <br>Ping @ " + new Date().toString() + "</p<br>";
			return Response.status(200).entity(output).build();
		}
	
	
}
