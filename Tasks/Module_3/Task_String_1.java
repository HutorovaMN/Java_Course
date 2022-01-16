package Module_3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task_String_1 {
	/*
	 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
	 */
	public static void main(String[] args) {
        String str = " jllkl     kkjh kjhkj";
        String[] spaces = str.split("\\S");
//        System.out.println(Arrays.toString(spaces));
        int count = 0;
        for (String s: spaces) {
            if (s.chars().count() > count){
                count = (int) s.chars().count();
            }
        }
        System.out.println("Max spaces == " + count);
    }

}
