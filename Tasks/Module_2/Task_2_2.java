package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2_2 {
	/*
	 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее
	 * члены, большие данного Z, этим числом. Подсчитать количество замен.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = scan.nextInt();
		System.out.println("Enter k:");
		int k = scan.nextInt();
		matrix(n, k);
	}

	public static void matrix(int n, int k) {
		int[] array = new int[n];
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10);
		}
		System.out.println(Arrays.toString(array));
		System.out.println();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > k) {
				array[i] = k;
				count++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(count);
	}
}
