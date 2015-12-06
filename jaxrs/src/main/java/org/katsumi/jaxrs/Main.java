package org.katsumi.jaxrs;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

/**
 * @author Katsumi
 */
public class Main
{
    public static void main(String... args) throws Exception
    {
        final Container container = new Container();

        final JAXRSArchive archive = ShrinkWrap.create(JAXRSArchive.class);
        archive.addClass(MyApplication.class);
        archive.addClass(HelloResource.class);
        archive.addAllDependencies();

        container.start().deploy(archive);
    }
}
