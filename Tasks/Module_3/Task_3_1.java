package Module_3;

import java.util.Scanner;

public class Task_3_1 {
	/* �������� � ������ ��� ��������� 'word' �� 'letter'. */
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("������� ������ � word");
			String k = scan.nextLine();
			String n = k.replaceAll("word", "letter");
			System.out.println(n);
		}

	}

}
