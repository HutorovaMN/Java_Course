package Module_4;

import java.util.Scanner;

public class Task_4_1 {

	/**
	 * �������� ����� Test1 ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ���� ����������.
	 *  �������� �����, ������� ������� ����� �������� ���� ����������, � �����, ������� ������� ���������� �������� 
	 *  �� ���� ���� ����������.
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a");
			int a = scan.nextInt();
			System.out.println("Enter b");
			int b = scan.nextInt();
			printString(a, b);
		}
	}

	public static int summa(int a, int b) {
		int s = a + b;
		return s;
	}

	public static int maximum(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	public static void printString(int a, int b) {
		System.out.println(a + " + " + b + " = " + summa(a, b));
		System.out.println("max = " + maximum(a, b));
	}

}
