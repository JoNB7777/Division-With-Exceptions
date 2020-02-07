package com.qa.divisionWithExceptions;

public class DivisionByLargerNumberException extends RuntimeException {
	@Override
	public String getMessage() {
		return "You're trying to divide a number by a larger number!";
	}

}
