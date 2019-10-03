package com.test.maven;

import com.test.maven.HelloWorld;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
	public void testPrintHello(){
        System.out.println("HelloWorldTest");
        GreaterNum gn = new GreaterNum();
        assertEquals("Hello World !!", HelloWorld.printHello());
	}
}
