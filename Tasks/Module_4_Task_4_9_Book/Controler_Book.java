package Module_4_Task_4_9_Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
 *  set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book, 
 *  с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.*/
public class Controler_Book {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		Book b1 = new Book(1, "Java Programming", "Fain", "Boston", 2014, 345, 34, "hard");
		Book b2 = new Book(2, " Practice Your Java ", "Fain", "Moscow", 2018, 545, 24, "hard");
		Book b3 = new Book(3, "Java", "Maurer", "Boston", 2022, 654, 45, "soft");
		books.add(b1);
		books.add(b2);
		books.add(b3);
		showAuthor(books);
		showPublisher(books);
		showYearPublication(books);
	}

	public static void showAuthor(List<Book> books) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("The following books are available.");
		System.out.println();
		System.out.println(books);
		System.out.println();
		System.out.println("Type in the author's name.");
		String autScan = scan.next();
		int count = 0;
		for (Book b : books) {
			if (b.getAuthor().equals(autScan)) {
				System.out.println(b);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Books by this author are not available.");
		}
	}

	public static void showPublisher(List<Book> books) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("The following books are available.");
		System.out.println();
		System.out.println(books);
		System.out.println();
		System.out.println("Type in the publisher's name.");
		String pubScan = scan.next();
		int count = 0;
		for (Book b : books) {
			if (b.getPublisher().equals(pubScan)) {
				System.out.println(b);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Books by this publisher are not available.");
		}
	}

	public static void showYearPublication(List<Book> books) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("The following books are available.");
		System.out.println();
		System.out.println(books);
		System.out.println();
		System.out.println("Enter year.");
		int yearScan = scan.nextInt();
		int count = 0;
		for (Book b : books) {
			System.out.println(b.getYearPublication());
			if (b.getYearPublication() > yearScan) {
				System.out.println(b);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There are no books with this year of publication.");
		}
	}
}
