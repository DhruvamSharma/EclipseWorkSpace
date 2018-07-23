package com.fil.junit.JUnitTesting;

import org.junit.Test;

import junit.framework.TestCase;

public class TestApp extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test(timeout = 1)
	public void testAddition() {

		App app = new App();
		for (int i = 0; i < 100000000; i++) {
			app.multiply();
		}

	}

}
