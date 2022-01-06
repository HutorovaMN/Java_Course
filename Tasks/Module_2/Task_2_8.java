package Module_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_8 {
	/*
	 * Дана последовательность целых чисел a1,a2,,an . Образовать новую
	 * последовательность, выбросив из исходной те члены, которые равны
	 * min(a1,a2,,an)
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
		delmin(array);
	}

	public static void delmin(int[] array) {
		int min = Integer.MAX_VALUE;
		int count = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] <= min) {
				min = array[i];
				count++;
			}
		}
		int[] arraymin = new int[array.length - count];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] != min) {
				arraymin[j] = array[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arraymin));
	}

}
