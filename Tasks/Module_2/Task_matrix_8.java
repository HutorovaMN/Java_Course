package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_matrix_8 {
	/*
	 * В числовой матрице поменять местами два столбца любых столбца, т. е. все
	 * элементы одного столбца поставить на соответствующие им позиции другого, а
	 * его элементы второго переместить в первый. Номера столбцов вводит
	 * пользователь с клавиатуры.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array that is to be created:");
		int n = scan.nextInt();
		System.out.println("Enter column1:");
		int colone = scan.nextInt();
		System.out.println("Enter column2:");
		int coltwo = scan.nextInt();
		matrix(n, colone, coltwo);
	}

	public static void matrix(int n, int colone, int coltwo) {
		Random ran = new Random();
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ran.nextInt(50);
			}
		}
		System.out.println("Matrix befor: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
		for (int i = 0; i < array.length; i++) {
			int temp = array[i][colone];
			array[i][colone] = array[i][coltwo];
			array[i][coltwo] = temp;
		}
		System.out.println("Matrix after: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}
