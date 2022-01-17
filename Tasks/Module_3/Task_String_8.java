package Module_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_String_8 {
	/*
	 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и
	 * вывести его на экран. Случай, когда самых длинных слов может быть несколько,
	 * не обрабатывать.
	 */

	public static void main(String[] args) {
		String str = "Hello Annastasja and Petr";
		System.out.println(str);
		String[] ar = str.split(" ");
		int max = 0;
		String word = "";
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].length() > max) {
				max = ar[i].length();
				word = ar[i];
			}
		}
		System.out.println(word);
	}
}