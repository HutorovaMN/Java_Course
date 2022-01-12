package Module_3;

import java.util.Scanner;

public class Task_3_2 {
	/*
	 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
	 * заменить на одиночные пробелы. Крайние пробелы в строке удалить..
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Введите строку с пробелами");
			String s = scan.nextLine();
			String strA = s.replaceAll("\\s+", " ").trim();
			System.out.println(strA);
		}
	}
}
