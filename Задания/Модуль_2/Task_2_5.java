package Module_2;

import java.util.Scanner;

public class Task_2_5 {
	/*
	 *Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n");
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number");
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
