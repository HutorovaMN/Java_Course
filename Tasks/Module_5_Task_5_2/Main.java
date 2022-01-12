package Module_5_Task_5_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Payment.PaymentIn> korzina = new ArrayList<Payment.PaymentIn>();

	/**
	 * Создать класс Payment с внутренним классом, с помощью объектов которого можно
	 * сформировать покупку из нескольких товаров.
	 */
	public static void main(String[] args) {
		Payment[] category = new Payment[3];
		category[0] = new Payment("clothes");
		category[1] = new Payment("chancellery");
		category[2] = new Payment("technique");
		Payment.PaymentIn tovar[] = new Payment.PaymentIn[15];
		category[0].tovar[0] = new Payment.PaymentIn(1, "dress", 10);
		category[0].tovar[1] = new Payment.PaymentIn(2, "pants", 12);
		category[0].tovar[2] = new Payment.PaymentIn(3, "shirt", 15);
		category[0].tovar[3] = new Payment.PaymentIn(4, "coat", 16);
		category[0].tovar[4] = new Payment.PaymentIn(5, "skirt", 18);

		category[1].tovar[5] = new Payment.PaymentIn(6, "pen", 3);
		category[1].tovar[6] = new Payment.PaymentIn(7, "pencil", 6);
		category[1].tovar[7] = new Payment.PaymentIn(8, "paper", 5);
		category[1].tovar[8] = new Payment.PaymentIn(9, "ruler", 3);
		category[1].tovar[9] = new Payment.PaymentIn(10, "notebook", 2);

		category[2].tovar[10] = new Payment.PaymentIn(11, "notebook", 233);
		category[2].tovar[11] = new Payment.PaymentIn(12, "tablet", 456);
		category[2].tovar[12] = new Payment.PaymentIn(13, "telephone", 235);
		category[2].tovar[13] = new Payment.PaymentIn(14, "television", 783);
		category[2].tovar[14] = new Payment.PaymentIn(15, "fridge", 452);

		printlnCategory(category, tovar);
	}

	static void printlnCategory(Payment[] category, Payment.PaymentIn[] tovar) {
		System.out.println("Выберите категорию товаров 1 - clothes, 2 - chancellery, 3 - technique");
		try (Scanner scan = new Scanner(System.in)) {
			int a = scan.nextInt();
			if (a == 1) {
				for (int i = 0; i < 5; i++) {
					System.out.println("ID: " + category[0].tovar[i].id + " " + "Name:  " + category[0].tovar[i].name
							+ " " + "Price: " + category[0].tovar[i].price);
				}
			} else if (a == 2) {
				for (int i = 5; i < 10; i++) {
					System.out.println("ID: " + category[1].tovar[i].id + " " + "Name:  " + category[1].tovar[i].name
							+ " " + "Price: " + category[1].tovar[i].price);
				}
			} else if (a == 3) {
				for (int i = 10; i < 15; i++) {
					System.out.println("ID: " + category[2].tovar[i].id + " " + "Name:  " + category[2].tovar[i].name
							+ " " + "Price: " + category[2].tovar[i].price);
				}
			}
			System.out.println("Введите ID товара");
			int b = scan.nextInt();
			chooseTovar(b, category, tovar);
			printKorzina(korzina);

			System.out.println("Желаете продолжить выбор (1 - да, 2 - нет)");
			int n = scan.nextInt();
			if (n == 1) {
				printlnCategory(category, tovar);
			} else {
				System.out.println("Спасибо за покупки.");
				printKorzina(korzina);
				return;
			}
		}
	}

	static void chooseTovar(int b, Payment[] category, Payment.PaymentIn[] tovar) {

		switch (b) {
		case 1:
			korzina.add(category[0].tovar[0]);
			break;
		case 2:
			korzina.add(category[0].tovar[1]);
			break;
		case 3:
			korzina.add(category[0].tovar[2]);
			break;
		case 4:
			korzina.add(category[0].tovar[3]);
			break;
		case 5:
			korzina.add(category[0].tovar[4]);
			break;
		case 6:
			korzina.add(category[1].tovar[5]);
			break;
		case 7:
			korzina.add(category[1].tovar[6]);
			break;
		case 8:
			korzina.add(category[1].tovar[7]);
			break;
		case 9:
			korzina.add(category[1].tovar[8]);
			break;
		case 10:
			korzina.add(category[1].tovar[9]);
			break;
		case 11:
			korzina.add(category[2].tovar[10]);
			break;
		case 12:
			korzina.add(category[2].tovar[11]);
			break;
		case 13:
			korzina.add(category[2].tovar[12]);
			break;
		case 14:
			korzina.add(category[2].tovar[13]);
			break;
		case 15:
			korzina.add(category[2].tovar[14]);
			break;
		default:
			System.out.println("Сделайте пожалуйста выбор.");
			break;
		}

	}

	static void printKorzina(ArrayList<Payment.PaymentIn> korzina) {
		System.out.println("Содержимое Вашей корзины:");
		System.out.println(korzina);

		int sum = korzina.stream().filter(o -> o.getPrice() > 1).mapToInt(o -> o.getPrice()).sum();

		System.out.println("Сумма к оплате = " + sum);

	}
}
