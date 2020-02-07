package com.qa.divisionWithExceptions;

public class DivisionByZeroException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Don't divide by 0";
	}

}
