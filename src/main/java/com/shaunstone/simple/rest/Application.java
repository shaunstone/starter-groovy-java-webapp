/**
 * 
 * DIRECTV PROPRIETARY
 * Copyright© 2014 DIRECTV, INC.
 * UNPUBLISHED WORK
 * ALL RIGHTS RESERVED
 * 
 * This software is the confidential and proprietary information of
 * DIRECTV, Inc. ("Proprietary Information").  Any use, reproduction, 
 * distribution or disclosure of the software or Proprietary Information, 
 * in whole or in part, must comply with the terms of the license 
 * agreement, nondisclosure agreement or contract entered into with 
 * DIRECTV providing access to this software.
 */
package com.shaunstone.simple.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.shaunstone.simple.endpoint.TestEndPoint;

public class Application extends ResourceConfig implements Feature {
	public Application() {
		packages("com.shaunstone.simple.endpoint");
		register(LoggingFilter.class);
		register(JacksonFeature.class);
	}

	@Override
	public boolean configure(FeatureContext context) {
		return true;
	}
}
