/**
 * 
 */
package com.test.helloworld;

import junit.framework.TestCase;

/**
 * @author Lizzardsking
 *
 */
public class HelloWorldMainTest extends TestCase {

	/**
	 * @param name
	 */
	public HelloWorldMainTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testExecuteHelloWorld() {
		HelloWorldMain.helloWorldExecute();
	}
}
