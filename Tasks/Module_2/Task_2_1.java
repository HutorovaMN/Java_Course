package Module_2;

import java.util.Scanner;

public class Task_2_1 {
	/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter K");
			double k = scan.nextDouble();
			double sum = 0;
			System.out.println("Enter N");
			int a = scan.nextInt();
			double[] array = new double[a];
			for (int i = 0; i < array.length; i++) {
				System.out.println("Enter array");
				array[i] = scan.nextDouble();
				if (array[i] % k == 0) {
					sum = sum + array[i];
				}
			}
			System.out.println("Summa " + k + " = " + sum);
		}

	}

}
