package Module_2;

import java.util.Scanner;

public class Task_2_5 {
	/*
	 * ���� ����� ����� �1 ,�2 ,..., �n . ������� �� ������ ������ �� �����, ���
	 * ������� �i > i.
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
