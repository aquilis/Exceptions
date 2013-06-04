package com.sirma.itt.javacourse.exceptions;

/**
 * Stores an array with a certain size and has methods for retrieving the lastly
 * added element, adding a new element and printing all elements on the console.
 */
public class CustomList {

	private final int size;
	private final Object[] array;
	/**
	 * The index of the most recently added element.
	 */
	private int top;

	/**
	 * Constructs the list with an initial size that can not be changed later.
	 * Sets the top element's index to -1 which means the list is empty.
	 * 
	 * @param size
	 *            is the initial size of the list
	 */
	public CustomList(int size) {
		this.size = size;
		this.array = new Object[size];
		this.top = -1;
	}

	/**
	 * Adds the specified object to the end of the array.
	 * 
	 * @param obj
	 *            is the object to be insterted in the list
	 * @throws FullListException
	 *             if the list is already full and new elements can't be added
	 */
	public void add(Object obj) throws FullListException {
		if ((top + 1) >= size) {
			throw new FullListException(
					"The operation add() is invalid for a full list");
		}
		array[++top] = obj;
	}

	/**
	 * Removes the last added element from the array.
	 * 
	 * @throws EmptyListException
	 *             if the list is empty and there's no element to remove
	 */
	public void remove() throws EmptyListException {
		if (top == -1) {
			throw new EmptyListException(
					"The operation remove() is invalid for an empty list");
		}
		// set the topmost element to null and decrease the top variable by one
		array[top--] = null;
	}

	/**
	 * Prints all array elemnts to the console line.
	 * 
	 * @throws EmptyListException
	 *             if the list is empty and there's no element to remove
	 */
	public void printAllElements() throws EmptyListException {
		if (top == -1) {
			throw new EmptyListException(
					"The requsetsed operation is invalid for an empty list");
		}
		System.out.print("[");
		for (int i = 0; i <= top; i++) {
			System.out.print(array[i]);
			if (i < top) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}