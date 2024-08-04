package com.indus.training.core.impl;

import com.indus.training.core.svc.IAverage;

/**
 * Implements {@link IAverage} and calculates the average of the input array
 */
public class Average implements IAverage {

	/**
	 * Calculates average of all the numbers in the input array and returns the
	 * result
	 */
	@Override
	public double average(double[] params) {
		double sum = 0.0;
		for (double param : params) {
			sum += param;
		}
		return sum / params.length;
	}

}
