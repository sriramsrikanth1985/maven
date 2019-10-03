package com.test.maven;

import com.test.maven.GreaterNum;

import junit.framework.TestCase;

public class GreaterNumTest extends TestCase {

	public void testGreaterNumber() {
		//fail("Not yet implemented");
        System.out.println("GreaterNumTest");
        GreaterNum gn = new GreaterNum();
        GreaterNumTest.assertEquals(20, gn.greaterNumber(10, 20));
	}

}
