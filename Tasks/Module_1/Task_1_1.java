package Module_1;

import java.util.Scanner;

public class Task_1_1 {
	/* z = ( (a – 3 ) * b / 2) + c */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a");
			double a = scan.nextDouble();
			System.out.println("Enter b");
			double b = scan.nextDouble();
			System.out.println("Enter c");
			double c = scan.nextDouble();
			double z = ((a - 3) * b / 2) + c;
			System.out.println("z = " + z);
		}
	}

}
