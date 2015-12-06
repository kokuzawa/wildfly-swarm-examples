package org.katsumi.ejb;

import javax.ejb.Stateless;

/**
 * @author Katsumi
 */
@Stateless
public class HelloEjb
{
    public String say()
    {
        return "Hello!";
    }
}
