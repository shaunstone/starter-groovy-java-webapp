
package com.shaunstone.simple.main

import javax.ws.rs.core.UriBuilder

import org.eclipse.jetty.server.Server
import org.glassfish.jersey.jetty.JettyHttpContainerFactory
import org.glassfish.jersey.server.ResourceConfig

import com.shaunstone.simple.rest.Application

class Launcher {

	static void main(String[] args){

		URI baseUri = UriBuilder.fromUri("http://localhost").port(9999).build();
		Server server = JettyHttpContainerFactory.createServer(baseUri, new Application());
	}
}