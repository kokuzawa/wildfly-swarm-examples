package org.katsumi.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Katsumi
 */
@Path("/hello")
public class HelloResource
{
    @GET
    public String hello()
    {
        return "Hello World!";
    }
}
