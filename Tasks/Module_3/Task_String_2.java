package Module_3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task_String_2 {
	/*
	 * В строке вставить после каждого символа 'a' символ 'b'.
	 */
	public static void main(String[] args) {
		String str = " ahgfhgfa aghha aaa";
		System.out.println(str);
		LinkedList<Character> words = new LinkedList<>();
		for (char s : str.toCharArray()) {
			words.add(s);
			if (s == 'a') {
				words.add('b');
			}
		}
		System.out.println("New == " + words);
	}
}