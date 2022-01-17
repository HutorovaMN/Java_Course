package Module_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_String_7 {
	/*
	 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все
	 * пробелы. Например, если было введено "abc cde def", то должно быть выведено
	 * "abcdef".
	 */

	public static void main(String[] args) {
		String str = "abc cde def";
		System.out.println(str);
		String db = str.replaceAll("(.)(?=.*\\1)", "").replaceAll(" ", "");
		System.out.println(db);
	}
}