package com.sirma.itt.javacourse.exceptions;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A simple reader that reads from the user numbers between 0 and 100 and throws
 * exception when the input is out of the expected borders.
 */
public final class NumsReader {
	/**
	 * An array list that will contain all numbers read from the user. May be
	 * later used for the main logic's purposes.
	 */
	private static ArrayList<Integer> list = new ArrayList<Integer>();

	/**
	 * Not designed to be instantiated.
	 */
	private NumsReader() {
	}

	/**
	 * Reads numbers from the user and stores them in list.
	 * 
	 * @throws InputOutOfBoundariesException
	 *             if the user inputs a number outside the boundaries 0-100
	 */
	public static void readNums() throws InputOutOfBoundariesException {
		// Try-with-resources statement not supported by Maven
		Scanner scn = null;
		try {
			scn = new Scanner(System.in);
			System.out.print("How many numbers are you going to enter: ");
			int count = scn.nextInt();
			while (count > 0) {
				System.out.print("Input a number: ");
				int temp = scn.nextInt();
				if ((temp < 0) || (temp > 100)) {
					throw new InputOutOfBoundariesException();
				}
				list.add(temp);
				count--;
			}
		} finally {
			if (scn != null) {
				scn.close();
			}
		}
	}

	/**
	 * A method that runs the class's static method.
	 * 
	 * @param args
	 *            are the cmd line arguments
	 * @throws InputOutOfBoundariesException
	 *             if the user inputs a number outside the boundaries 0-100
	 */
	public static void main(String[] args) throws InputOutOfBoundariesException {
		readNums();
	}
}