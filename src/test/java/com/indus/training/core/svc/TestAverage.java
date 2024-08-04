package com.indus.training.core.svc;

import com.indus.training.core.impl.Average;

import junit.framework.TestCase;

/**
 * Provides Test Cases for Average Class
 */
public class TestAverage extends TestCase {

	private Average avgObj = null;

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		avgObj = new Average();
	}

	/**
	 * Tear down the test environment
	 */
	protected void tearDown() throws Exception {
		avgObj = null;
	}

	/**
	 * Test case for average method with two parameters
	 */
	public void testAverageScenario1() {

		// 1. Inputs
		double[] params = new double[] { 1.0, 3.0 };

		// 2. Expected Result
		double expResult = 2.0;

		// 3. Actual Result
		double actResult = avgObj.average(params);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);

	}

	/**
	 * Test case for average method with three parameters
	 */
	public void testAverageScenario2() {

		// 1. Inputs
		double[] params = new double[] { 1.0, 3.0, 5.0 };

		// 2. Expected Result
		double expResult = 3.0;

		// 3. Actual Result
		double actResult = avgObj.average(params);

		// 4. Assertion
		assertEquals(expResult, actResult, 0);

	}

}
