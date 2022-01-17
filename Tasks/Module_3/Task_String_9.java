package Module_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_String_9 {
	/*
	 * Посчитать количество строчных (маленьких) и прописных (больших) букв в
	 * введенной строке. Учитывать только английские буквы.
	 */

	public static void main(String[] args) {
		String str = "Hello!Как дела?  ";
		System.out.println(str);
		int count = str.length() - str.replaceAll("[a-zA-Z]", "").length();
		System.out.println(count);
	}
}