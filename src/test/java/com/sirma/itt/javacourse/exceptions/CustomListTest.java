package com.sirma.itt.javacourse.exceptions;

import org.junit.BeforeClass;
import org.junit.Test;
/**
 * Testing the functionallity of the Custom list's methods and the expected
 * exceptions.
 */
public class CustomListTest {
	private static CustomList myList;
	
	/**
	 * Instantiate the custom list.
	 * 
	 * @throws FullListException
	 *             if the list is already full and we attempt to add new
	 *             elements
	 * @throws EmptyListException
	 *             if we try to retrieve a value from an empty list
	 */
	@BeforeClass
	public static void initList() throws FullListException, EmptyListException {
		myList = new CustomList(7);
	}

	/**
	 * We expect FullListException when we try to add 11 elements to the already
	 * filled list with 7 elements.
	 * 
	 * @throws FullListException
	 *             if the list is already full and we attempt to add new
	 *             elements
	 */
	@Test(expected = FullListException.class)
	public void testFullList() throws FullListException {
		for (int i = 0; i < 11; i++) {
			myList.add(new Integer(i + 1));
		}
	}

	/**
	 * We expect EmptyListException when we try to retrive an element from an
	 * empty list.
	 * 
	 * @throws EmptyListException
	 *             if we try to retrieve a value from an empty list
	 */
	@Test(expected = EmptyListException.class)
	public void testEmptyList() throws EmptyListException {
		for (int i = 0; i < 11; i++) {
			myList.remove();
		}
	}
}
