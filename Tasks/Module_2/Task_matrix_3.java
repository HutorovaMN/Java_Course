package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_3 {
	/*
	 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы..
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Enter the size of the array that is to be created:");
		int n = scan.nextInt();
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ran.nextInt(10);
			}
		}
		System.out.println("Matrix = ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Enter the matrix row.");
		int r = scan.nextInt();
		System.out.println("Enter the matrix column.");
		int c = scan.nextInt();
		System.out.println("Row " + r + " = ");
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[r - 1][j] + " ");
		}
		System.out.println();
		System.out.println("Column " + c + " = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][c - 1] + " ");
		}
	}
}
