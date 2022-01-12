package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_10 {
	/*
	 * Найти положительные элементы главной диагонали квадратной матрицы.
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
				array[i][j] = 10 - ran.nextInt(20);
			}
		}
		System.out.println("Matrix: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i][i] > 0) {
				System.out.print(array[i][i] + " ");
			}
		}

	}
}
