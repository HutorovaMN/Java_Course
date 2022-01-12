package Module_3;

import java.util.Scanner;

public class Task_3_4 {
	/*
	 * В строке найти количество чисел.
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the string");
			String s = scan.nextLine();
			int str = s.replaceAll("\\D", "").length();
			System.out.println("Number of numbers = " + str);
		}
	}
}
