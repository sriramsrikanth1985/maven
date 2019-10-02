package docker.github;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
	public void testPrintHello(){
        System.out.println("HelloWorldTest");
        GreaterNum gn = new GreaterNum();
        assertEquals("Hello World Srikanth !!", HelloWorld.printHello());
	}
}
