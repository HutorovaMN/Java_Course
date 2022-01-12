package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_9 {
	/*
	 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	 * столбце. Определить, какой столбец содержит максимальную сумму.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array that is to be created:");
		int n = scan.nextInt();
		matrix(n);
	}

	public static void matrix(int n) {
		Random ran = new Random();
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ran.nextInt(10);
			}
		}
		System.out.println("Matrix: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		int[] sum = new int[n];
		int max = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum[j] = sum[j] + array[i][j];
			}
		}
		System.out.println("sum = ");
		System.out.println(Arrays.toString(sum));
		for (int j = 0; j < sum.length; j++) {
			if (max < sum[j]) {
				max = sum[j];
				count = j;
			}
		}
		System.out.println("Summ column: " + max + "  Number column: " + count);
	}
}
