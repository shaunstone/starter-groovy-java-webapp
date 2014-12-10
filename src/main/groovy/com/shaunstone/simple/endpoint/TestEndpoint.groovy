package com.shaunstone.simple.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import com.shaunstone.simple.model.TestResponse;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
class TestEndPoint{

	@GET
	def getTestResponse(){
		return new TestResponse(message: "Hi this is cool", attribs: ["cool":"stuff","cooler":"stuffs"] )
	}
}