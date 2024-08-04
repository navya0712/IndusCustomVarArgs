package com.indus.training.core.impl;

import com.indus.training.core.svc.IAddition;

/**
 * Provides implementation of {@link IAddition} Interface
 */
public class Addition implements IAddition {

	/**
	 * Calculates the sum of all double values of input array
	 */
	@Override
	public double addition(double[] params) {
		double result = 0.0;
		{
			for (double param : params) {
				result += param;

			}

		}
		return result;
	}

}
