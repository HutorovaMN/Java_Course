package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_16 {
	/*
	 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
	 * составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу,
	 * каждой строке и каждой из двух больших диагоналей равны между собой.
	 * Построить такой квадрат.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter m:");
		int m = scan.nextInt();
		matrix(m);
	}

	public static void matrix(int m) {
		int[][] matrix = new int[m][m];
		int magVal = (int) ((m * (Math.pow(m, 2) + 1)) / 2);
		int maxVal = (int) Math.pow(m, 2);

		for (int i = 1, j = 0, k = matrix.length / 2; i <= maxVal; i++, j--, k++) {
			if (j >= 0 && k < matrix.length) {
				if (matrix[j][k] == 0) {
					matrix[j][k] = i;
				} else {
					j += 2;
					k--;
					matrix[j][k] = i;
				}
			} else if (j < 0 && k < matrix.length) {
				j = matrix.length - 1;
				if (matrix[j][k] == 0) {
					matrix[j][k] = i;
				}
			} else if (j < 0 && k >= matrix.length) {
				j += 2;
				k--;
				matrix[j][k] = i;
			} else if (k >= matrix.length && j >= 0) {
				k = 0;
				if (matrix[j][k] == 0) {
					matrix[j][k] = i;
				} else {
					j += 2;
					k--;
					matrix[j][k] = i;
				}
			}
		}
		System.out.println("Array :");
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
