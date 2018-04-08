package _01_array_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		int[] tmp = new int[testArray.length + 1];
		boolean passed = false;
		for (int k = 0; k < tmp.length; k++) {
			if(!passed && k != i) {
				tmp[k] = testArray[k];
			}
			else {
				if(k == i) {
					tmp[k] = j;
					passed = !passed;
				}
				else {
					tmp[k] = testArray[k - 1];
				}
			}
		}
		return tmp;
	}
	public static Object[] insertAt(Object[] testArray, int i, Object j) {
		Object[] tmp = new Object[testArray.length + 1];
		boolean passed = false;
		for (int k = 0; k < tmp.length; k++) {
			if(!passed && k != i) {
				tmp[k] = testArray[k];
			}
			else {
				if(k == i) {
					tmp[k] = j;
					passed = !passed;
				}
				else {
					tmp[k] = testArray[k - 1];
				}
			}
		}
		return tmp;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		Object[] tmp = insertAt(orderedArray,2,string);
		String[] tmp2 = new String[tmp.length];
		for (int i = 0; i < tmp2.length; i++) {
			if(tmp[i] instanceof String) {
				tmp2[i] = (String)tmp[i];
			}
		}
		Sorting.sort(tmp2);
		return tmp2;
	}
	
}
