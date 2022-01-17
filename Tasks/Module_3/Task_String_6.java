package Module_3;

import java.util.Arrays;

public class Task_String_6 {
	/*
	 * Из заданной строки получить новую, повторив каждый символ дважды.
	 */

	public static void main(String[] args) {
		String str = "Hello";
		StringBuilder db = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			db.append(str.charAt(i));
			db.append(str.charAt(i));
		}
		System.out.println(db);
	}
}
