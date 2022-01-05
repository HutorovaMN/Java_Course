package Module_1;

import java.util.Scanner;

public class Task_1_2 {
	/* z=(𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter x");
			double x = scan.nextDouble();
			System.out.println("Enter y");
			double y = scan.nextDouble();
			double z = (Math.sin(x) + Math.cos(y)) / (Math.sin(y)) * Math.tan(x * y);
			System.out.println("z = " + z);
		}
	}

}