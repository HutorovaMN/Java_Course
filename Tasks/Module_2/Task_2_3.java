package Module_2;

import java.util.Scanner;


public class Task_2_3 {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter N");
			int n = scan.nextInt();
			int[] array = new int[n];
			int noll = 0;
			int minus = 0;
			int plus = 0;
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (array[i] == 0) {
					noll++;
				}
				if (array[i] > 0) {
					plus++;
				}
				if (array[i] < 0) {
					minus++;
				}
			}
			System.out.println(noll + " " + plus + " " + minus);
		}

	}

}
