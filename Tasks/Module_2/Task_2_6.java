package Module_2;

import java.util.Scanner;

public class Task_2_6 {

	/*
	 * «адана последовательность N вещественных чисел. ¬ычислить сумму чисел,
	 * пор€дковые номера которых €вл€ютс€ простыми числами.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n");
		int n = scan.nextInt();
		int[] array = new int[n];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number");
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (isPrime(i)) {
				sum += array[i];
			}
		}
		System.out.println("Summ: " + sum);
	}

	public static boolean isPrime(int x) {
		if (x < 2)
			return false;
		for (int i = 2; i <= x / 2; i++) {
			int temp = x % i;
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}
}