package com.bootstrap.j4.boilerplate;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.palominolabs.jersey.cors.Cors;

/**
 * A minimal Jersey Resource. Note that this class is a POJO - it does not need
 * to know anything about Guice. Although, if we wanted to Inject members using
 * Guice, we could!
 */
@Path("/sample")
@Cors(allowOrigin = "*")
public class SampleResource {
    @GET
    @Produces( { MediaType.APPLICATION_JSON })
    public String get() {
        return "{ x: 123 }";
    }
    
    @OPTIONS    
    public String options() {
        return "foo";
    }   
 
}
