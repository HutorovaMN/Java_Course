package Module_3;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task_String_4 {
	/*
	 * � ������� ������� ����������� � �������� ������������ ��������� �� ������
	 * ����� ������������� ����� �����.
	 */
	public static void main(String[] args) {
		String s = "�����������";
		List<Character> list = new LinkedList<>();
		for (char ch : s.toCharArray()) {
			list.add(ch);
		}
		int letter1 = list.indexOf('�');
		int letter2 = list.indexOf('�');
		int letter3 = list.indexOf('�');
		System.out.println(String.valueOf(list.get(letter1)) + list.get(letter2) + list.get(letter3) + list.get(letter1));

	}
}
