package _01_array_manipulation;

import java.util.Arrays;

public class Sorting {

	public static void sort(String[] testArray) {
		for (int i = 0; i < testArray.length; i++) {
			for (int j = 0; j < testArray.length; j++) {
				while(testArray[j].compareTo(testArray[i]) > 0) {
					String tmp = testArray[j];
					testArray[j] = testArray[i];
					testArray[i] = tmp;
				}
			}
		}
	}

}
