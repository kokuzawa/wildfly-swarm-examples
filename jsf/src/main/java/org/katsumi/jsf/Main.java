package org.katsumi.jsf;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.ClassLoaderAsset;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.undertow.WARArchive;

/**
 * @author Katsumi
 */
public class Main
{
    public static void main(String... args) throws Exception
    {
        final Container container = new Container();

        final WARArchive warArchive = ShrinkWrap.create(WARArchive.class);
        warArchive.addAsWebResource(
                new ClassLoaderAsset("index.xhtml", Main.class.getClassLoader()), "index.xhtml");
        warArchive.addAsWebInfResource(
                new ClassLoaderAsset("WEB-INF/web.xml", Main.class.getClassLoader()), "web.xml");
        warArchive.addAllDependencies();

        container.start().deploy(warArchive);
    }
}
