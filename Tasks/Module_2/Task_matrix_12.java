package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_12 {
	/*
	 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
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
				array[i][j] = ran.nextInt(15);
			}
		}
		System.out.println("Befor array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		for (int i = 0; i < array.length; i++) {
			for (int k = array.length; k > 1; k--) {
				for (int j = 1; j < k; j++) {
					if (array[i][j] < array[i][j - 1]) {
						int temp = array[i][j];
						array[i][j] = array[i][j - 1];
						array[i][j - 1] = temp;
					}
				}
			}
		}
		System.out.println("After array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
