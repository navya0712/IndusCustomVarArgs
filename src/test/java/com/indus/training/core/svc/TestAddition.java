package com.indus.training.core.svc;

import com.indus.training.core.impl.Addition;

import junit.framework.TestCase;

/**
 * Provides Test Cases for addition class
 */
public class TestAddition extends TestCase {

	private Addition addObj = null;

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		addObj = new Addition();
	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		addObj = null;
	}

	/**
	 * Test Case for addition method with two parameters
	 */
	public void testAdditionScenario1() {

		// 1. Inputs
		double[] params = new double[] { 1.0, 2.0 };

		// 2. Expected Result
		double expResult = 3.0;

		// 3. Actual Result
		double actResult = addObj.addition(params);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test Case for addition method with three parameters
	 */
	public void testAdditionScenario2() {

		// 1. Inputs
		double[] params = new double[] { 1.0, 2.0, 3.0 };

		// 2. Expected Result
		double expResult = 6.0;

		// 3. Actual Result
		double actResult = addObj.addition(params);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}

	/**
	 * Test Case for addition method with four parameters
	 */
	public void testAdditionScenario3() {

		// 1. Inputs
		double[] params = new double[] { 3.0, 2.0, 3.0, 5.0 };

		// 2. Expected Result
		double expResult = 13.0;

		// 3. Actual Result
		double actResult = addObj.addition(params);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);
	}
}
