package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_7 {
	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array that is to be created:");
		int n = scan.nextInt();
		matrix(n);
	}

	public static void matrix(int n) {
		double[][] array = new double[n][n];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2) / array.length));
				if (array[i][j] > 0) {
					count++;
				}
			}
		}
		System.out.println("Matrix: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		System.out.println("Count: " + count);
	}
}
