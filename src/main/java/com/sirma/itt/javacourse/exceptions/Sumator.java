package com.sirma.itt.javacourse.exceptions;

/**
 * A simple utility class that finds the sum of two numbers represented as
 * strings.
 */
public final class Sumator {
	/**
	 * Not designed to be instantiated.
	 */
	private Sumator() {
	}

	/**
	 * Finds the sum of two numbers represented as strings.
	 * 
	 * @param a
	 *            is a number represented as a string
	 * @param b
	 *            is a number represented a a string
	 * @return the sum of a and b
	 */
	public static String sum(String a, String b) {
		double temp = 0;
		try {
			temp = Double.parseDouble(a) + Double.parseDouble(b);
		} catch (NumberFormatException e) {
			System.out
					.println("Wrong input format! Please, input numbers only.");
			return "N/A";
		} catch (NullPointerException npe) {
			System.out.println("The input strings have not been initialised.");
			return "N/A";
		}

		return Double.toString(temp);
	}
}