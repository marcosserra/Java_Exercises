package exercises.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Marc
 * 
 * Calculate the number of key presses in a determinate keypad 
 */

public class Keypad {

	public static int calculateKeypad(char keypad) {

		// Custom attributes of the keypad and add them to an ArrayList
		int result = 0;
		char mayus = Character.toUpperCase(keypad);

		String keypad1 = "1";
		String keypad2 = "ABC2";
		String keypad3 = "DEF3";
		String keypad4 = "GHI4";
		String keypad5 = "JKL5";
		String keypad6 = "MNO6";
		String keypad7 = "PQRS7";
		String keypad8 = "TUV8";
		String keypad9 = "WXYZ9";
		String keypad10 = "*";
		String keypad11 = " 0";
		String keypad12 = "#";

		List<String> numbers = new ArrayList<String>();
		numbers.add(keypad1);
		numbers.add(keypad2);
		numbers.add(keypad3);
		numbers.add(keypad4);
		numbers.add(keypad5);
		numbers.add(keypad6);
		numbers.add(keypad7);
		numbers.add(keypad8);
		numbers.add(keypad9);
		numbers.add(keypad10);
		numbers.add(keypad11);
		numbers.add(keypad12);

		// Find and count the position of the keypad
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < (numbers.get(i).length()); j++) {
				if (mayus == (numbers.get(i).charAt(j))) {
					result += j + 1;
				}
			}
		}
		return result;

	}

	public static int presses(String phrase) {

		int result = 0;
		String[] parts = phrase.split("(?!^)");

		//Call the method to calculate the value of each character
		for (int i = 0; i < parts.length; i++) {
			result += calculateKeypad((parts[i].charAt(0)));
		}

		return result;
	}

}
