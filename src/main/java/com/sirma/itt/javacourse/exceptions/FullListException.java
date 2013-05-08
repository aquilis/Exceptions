package com.sirma.itt.javacourse.exceptions;

/**
 * An exception thrown when a method tries to perform an operation that requires
 * the list not be full, but it is.
 */
public class FullListException extends Exception {
	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructos the exception with no user-defined detail message.
	 */
	public FullListException() {
		super("\nThis operation is inavild for a full list");
	}

	/**
	 * Constructos the exception with a detail message.
	 * 
	 * @param message
	 *            is the detail message
	 */
	public FullListException(String message) {
		super(message);
	}

}