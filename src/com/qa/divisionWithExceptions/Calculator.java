package com.qa.divisionWithExceptions;

import java.awt.geom.CubicCurve2D.Double;

public class Calculator {
	
	public double divide(int a, int b) {
		double firstIntegerAsDouble = (double) a;
		double secondIntegerAsDouble = (double) b;
		if (b == 0) {
			throw new DivisionByZeroException();
		} else if (b > a) {
			throw new DivisionByLargerNumberException();
		} else {
		return firstIntegerAsDouble/secondIntegerAsDouble;
		}
	}

}
