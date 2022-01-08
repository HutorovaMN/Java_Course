package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_2 {
	/*
	 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
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
		diagonals(array);
	}

	public static void diagonals(int[][] array) {
		System.out.println("Old matrix = ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Diagonals = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][array.length - 1 - i] + " ");
		}
	}
}
