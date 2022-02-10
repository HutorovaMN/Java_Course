package Module_4_Task_4_10_Airline;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/
public class Controller {

	public static void main(String[] args) {
		List<Airline> flights = new ArrayList<>();
		Info info = new Info();
		Airline fl1 = new Airline("Moscow", 345, "Boing-737", LocalDateTime.of(2022, Month.MARCH, 15, 15, 00, 00),
				"monday");
		Airline fl2 = new Airline("Boston", 345, "Boing-747", LocalDateTime.of(2022, Month.MARCH, 10, 10, 00, 00),
				"tuesday");
		Airline fl3 = new Airline("Minsk", 345, "Boing-767", LocalDateTime.of(2022, Month.JULY, 15, 12, 00, 00),
				"wednesday");
		Airline fl4 = new Airline("Mogilev", 345, "Boing-737", LocalDateTime.of(2022, Month.FEBRUARY, 18, 14, 20, 00),
				"monday");
		Airline fl5 = new Airline("Mogilev", 345, "Boing-737", LocalDateTime.of(2022, Month.MAY, 26, 12, 40, 00),
				"wednesday");

		LocalDateTime after = LocalDateTime.of(2022, 3, 1, 8, 0, 00);

		flights.add(fl1);
		flights.add(fl2);
		flights.add(fl3);
		flights.add(fl4);
		flights.add(fl5);

		System.out.println("Departure list");
		System.out.println();
		System.out.println(flights);
		System.out.println();
		System.out.println("Destination Mogilev");
		System.out.println();
		info.test(flights, a -> a.getDestination().equals("Mogilev"));
		System.out.println();
		System.out.println("Day of week Wednesday");
		System.out.println();
		info.test(flights, a -> a.getWeekDays().equals("wednesday"));
		System.out.println();
		System.out.println("Day of week Monday and departure time is more than March 1, 8.00");
		System.out.println();
		info.test(flights, a -> a.getWeekDays().equals("monday") && a.getDepartureTime().isAfter(after));

	}
}

class Info {
	void test(List<Airline> flights, Predicate<Airline> sc) {
		for (Airline s : flights) {
			if (sc.test(s)) {
				System.out.println(s.toString());
			}
		}
	}

}
