package Module_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Task_String_10 {
	/*
	 * Строка X состоит из нескольких предложений, каждое из которых кончается
	 * точкой, восклицательным или вопросительным знаком. Определить количество
	 * предложений в строке X.
	 */

	public static void main(String[] args) {
		String str = "Hello!How are you? I am fine, thanks.";
		System.out.println(str);
		StringTokenizer word = new StringTokenizer(str, ".!?");
		System.out.println(word.countTokens());
	}
}