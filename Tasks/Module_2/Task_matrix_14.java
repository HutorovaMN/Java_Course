package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_14 {
	/*
	 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в
	 * каждом столбце число единиц равно номеру столбца.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter m:");
		int m = scan.nextInt();
		System.out.println("Enter n:");
		int n = scan.nextInt();
		matrix(m, n);
	}

	public static void matrix(int m, int n) {
		int[][] array = new int[m][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array[i].length; j++) {
				array[i][j] = 1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
