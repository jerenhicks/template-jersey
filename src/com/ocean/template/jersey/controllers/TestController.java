package com.ocean.template.jersey.controllers;

import java.math.BigInteger;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ocean.template.jersey.model.Test;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Test controller that will handle demonstrating the api functionality.
 * @author arcticrain
 *
 */
@Path("/test")
@Api(value = "/test", description = "This controller is an example.")
public class TestController {
	/** random value.*/
	private Random random = new Random();
		
	/**
	 * Test method that will handle returning a test class back. 
	 * @return a random test class.
	 */
	@GET
	@Produces("application/json")
	@ApiOperation(value = "Retrieves a random Test objects", notes = "Build to test out functionality.", response = Test.class, responseContainer = "Test")
	public Test getTest() {
		Test test = new Test(new BigInteger(130, random).toString(32), new BigInteger(130, random).toString(32));
	    return test;
	}
	
	@POST
	@Produces("application/json")
	@ApiOperation(value = "Adds the test and returns it.", notes = "More test notes here.", response = Test.class, responseContainer = "Test")
	public Test addTest(String one, String two) {
		return new Test(one, two);
	}
	
}