package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_1 {
	/*
	 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
	 * больше последнего.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Enter the number of rows of the array:");
		int n = scan.nextInt();
		System.out.println("Enter the number of columns of the array:");
		int m = scan.nextInt();
		int[][] array = new int[n][m];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ran.nextInt(100);
			}
		}
		oddcolumns(array);
	}

	public static void oddcolumns(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Odd columns = ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[0][j] > array[array.length - 1][j]) {
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}
