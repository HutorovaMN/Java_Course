package Module_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_9 {
	/*
	 * В массиве целых чисел с количеством элементов n найти наиболее часто
	 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
	 * них.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array that is to be created:");
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the elements of the array :");
			array[i] = scan.nextInt();
		}
		commonNumber(array);
	}

	public static void commonNumber(int[] array) {
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					newArray[i]++;
				}
			}
		}
		int result = array[0];
		int pop = newArray[0];
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] > pop) {
				pop = newArray[i];
				result = array[i];
			}
			if ((pop == newArray[i]) && (array[i] < result)) {
				result = array[i];
			}
		}
		System.out.println("Minimum number = " + result);
	}
}