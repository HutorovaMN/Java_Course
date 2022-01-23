package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_13 {
	/*
	 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
	 */

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the size of the array that is to be created:");
			int n = scan.nextInt();
			matrix(n);
		}
	}

	public static void matrix(int n) {
		Random ran = new Random();
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ran.nextInt(9);
			}
		}
		System.out.println("Befor array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		for (int k = array.length; k > 1; k--) {
			for (int i = 1; i < k; i++) {
				for (int j = 0; j < array.length; j++) {
					if (array[i][j] < array[i - 1][j]) {
						int temp = array[i][j];
						array[i][j] = array[i - 1][j];
						array[i - 1][j] = temp;
					}
				}
			}
		}
		System.out.println("After array1:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		for (int k = array.length; k > 1; k--) {
			for (int i = 1; i < k; i++) {
				for (int j = 0; j < array.length; j++) {
					if (array[i][j] > array[i - 1][j]) {
						int temp = array[i][j];
						array[i][j] = array[i - 1][j];
						array[i - 1][j] = temp;
					}
				}
			}
		}
		System.out.println("After array2:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
