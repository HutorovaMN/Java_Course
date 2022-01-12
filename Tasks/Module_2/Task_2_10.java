package Module_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2_10 {
	/*
	 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из
	 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
	 * Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("Enter the size of the array that is to be created:");
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt();
		}
		compression(array);
	}

	public static void compression(int[] array) {
		System.out.println("Old array = " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				array[i] = 0;
			}
		}
		System.out.println("New array = " + Arrays.toString(array));
	}
}
