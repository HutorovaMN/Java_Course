package Module_4_Task_4_8_Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task_4_8_Customer {
	/*
	 * —оздать класс Customer, спецификаци€ которого приведена ниже. ќпределить
	 * конструкторы, set- и get- методы и метод toString(). —оздать второй класс,
	 * агрегирующий массив типа Customer, с подход€щими конструкторами и методами.
	 * «адать критерии выбора данных и вывести эти данные на консоль.  ласс
	 * Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер
	 * банковского счета. Ќайти и вывести: a) список покупателей в алфавитном
	 * пор€дке; b) список покупателей, у которых номер кредитной карточки находитс€
	 * в заданном интервале
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Customer> list = new ArrayList<>();
		Customer cust1 = new Customer(1, "Ivanov", "Ivan", "Ivanivich", "Mogilew", 243, 123);
		Customer cust2 = new Customer(2, "Petrov", "Petr", "Petrovich", "Grodno", 456, 145);
		Customer cust3 = new Customer(3, "Sidorov", "Sidr", "Sidorovich", "Minsk", 567, 154);
		Customer cust4 = new Customer(4, "Avanosov", "Wasja", "Wasiljewich", "Mogilew", 432, 153);
		Customer cust5 = new Customer(5, "Fursow", "Gleb", "Michajlowich", "Vitebsk", 987, 152);
		Customer cust6 = new Customer(6, "Berdov", "Stas", "Sidorovich", "Gomel", 876, 321);
		
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		list.add(cust4);
		list.add(cust5);
		list.add(cust6);
		System.out.println("Customers befer sortet");
		System.out.println(list.toString());
		System.out.println();
		Collections.sort(list);
		System.out.println("Customers in alphabetical order");
		System.out.println(list.toString());
		System.out.println();
		System.out.println("Enter Credit Card Intervals n and m");
		int n = scan.nextInt();
		int m = scan.nextInt();
		Customer.cardinterval(list, n, m);

	}
}

