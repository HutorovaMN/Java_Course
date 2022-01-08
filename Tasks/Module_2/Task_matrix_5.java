package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_5 {
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
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length - i; j++) {
				array[i][j] = i + 1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
