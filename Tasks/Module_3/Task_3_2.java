package Module_3;

import java.util.Scanner;

public class Task_3_2 {
	/*
	 * ������� � ������ ��� ������ �������, �� ���� ����� ������ ������ ��������
	 * �������� �� ��������� �������. ������� ������� � ������ �������..
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("������� ������ � ���������");
			String s = scan.nextLine();
			String strA = s.replaceAll("\\s+", " ").trim();
			System.out.println(strA);
		}
	}
}
