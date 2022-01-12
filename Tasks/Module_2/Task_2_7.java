package Module_2;

import java.util.Random;

public class Task_2_7 {
	/*
	 * Даны действительные числа a1, a2, , an. Найти max (a1 + a2n, a2 + a2n − 1,
	 * , an + an + 1).
	 */

	public static void main(String[] args) {
		int n = 20;
		System.out.println(maximum(n));
	}

	public static double maximum(int n) {
		double[] array = new double[n];
		double[] arraymax = new double[n / 2];
		Random generator = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = generator.nextDouble();
		}
		for (int i = 0; i < array.length / 2; i++) {
			arraymax[i] = array[i] + array[array.length - 1];
		}
		double max = arraymax[0];
		for (int i = 1; i < arraymax.length; i++) {
			if (max < arraymax[i]) {
				max = arraymax[i];
			}
		}
		return max;
	}

}
