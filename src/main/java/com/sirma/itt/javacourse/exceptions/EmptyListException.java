package com.sirma.itt.javacourse.exceptions;

/**
 * An exception thrown when a method tries to perform an operation that requires
 * the list not to be empty, but it is.
 */
public class EmptyListException extends Exception {
	/**
	 * Comment for serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs the exception with no user-defined detail message.
	 */
	public EmptyListException() {
		super("\nThis operation is inavild for an empty list");
	}

	/**
	 * Constructos the exception with a detail message.
	 * 
	 * @param message
	 *            is the detail message
	 */
	public EmptyListException(String message) {
		super(message);
	}

}