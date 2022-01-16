package Module_3;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task_String_3 {
	/*
	 *Проверить, является ли заданное слово палиндромом.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		List<Character> list = new LinkedList<>();
		for (char ch : s.toCharArray()) {
			list.add(ch);
		}
		ListIterator<Character> iterator = list.listIterator();
		ListIterator<Character> reverseIterator = list.listIterator(list.size());
		boolean isPalendrome = true;
		while (iterator.hasNext() && reverseIterator.hasPrevious()) {
			if (iterator.next() != reverseIterator.previous()) {
				isPalendrome = false;
				break;
			}
		}
		if (isPalendrome) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
