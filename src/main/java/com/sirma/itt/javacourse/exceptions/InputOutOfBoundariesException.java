package com.sirma.itt.javacourse.exceptions;

/**
 * Exception designed to be thorwn when the input parameters are outside the
 * expected borders of the method.
 */
public class InputOutOfBoundariesException extends Exception {

	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs the exception with no user-defined detail message.
	 */
	public InputOutOfBoundariesException() {
		super(
				"\nThe input parameter(s) are outside the method's expected borders.");
	}

	/**
	 * Constructs the exception with a detail message.
	 * 
	 * @param message
	 *            is the detail message
	 */
	public InputOutOfBoundariesException(String message) {
		super(message);
	}
}