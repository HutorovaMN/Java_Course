package Module_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_String_5 {
	/*
	 * ����������, ������� ��� ����� �������� �������� ������ ����������� ����� ���.
	 */
	public static void main(String[] args) {
		String str = "ewyewaadfsfdaaaa";
		ArrayList<Character> words = new ArrayList<Character>();
		for (char c : str.replaceAll("a", "").toCharArray()) {
			words.add(c);
		}
		System.out.println(str.length() - words.size());
	}
}
