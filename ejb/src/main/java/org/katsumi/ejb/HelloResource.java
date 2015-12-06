package org.katsumi.ejb;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Katsumi
 */
@Path("/hello")
public class HelloResource
{
    @Inject
    private HelloEjb helloEjb;

    @GET
    public String hello()
    {
        return helloEjb.say();
    }
}
