package Module_4_Task_4_4_Train;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task_4_4_Train {
	/*
	 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
	 */
	public static void main(String[] args) {
		List<Train> trains = new ArrayList<>();
		Train train1 = new Train("Minsk", 23, LocalDateTime.of(2022, Month.FEBRUARY, 10, 10, 35));
		Train train2 = new Train("Mogilew", 45, LocalDateTime.of(2022, Month.FEBRUARY, 1, 20, 25));
		Train train3 = new Train("Gomel", 67, LocalDateTime.of(2022, Month.FEBRUARY, 15, 15, 10));
		Train train4 = new Train("Grodno", 12, LocalDateTime.of(2022, Month.FEBRUARY, 19, 10, 50));
		Train train5 = new Train("Vitebsk", 89, LocalDateTime.of(2022, Month.FEBRUARY, 23, 23, 30));
		trains.add(train1);
		trains.add(train2);
		trains.add(train3);
		trains.add(train4);
		trains.add(train5);
		Menu(trains);
	}

	public static void Menu(List trains) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select a menu item:\r\n" + "1 - full schedule;\r\n" + "2 - information about the train;\r\n"
				+ "3 - sorting trains by destination;\r\n" + "4 - exit.");
		int n = scan.nextInt();
		switch (n) {
		case 1: {
			fullschedule(trains);
			break;
		}
		case 2: {
			informationtrain(trains);
			break;
		}
		case 3: {
			sortdestination(trains);
			break;
		}
		case 4: {
			System.exit(0);
		}
		default: {
			System.out.println("Select a menu item:\r\n" + "1 - full schedule;\r\n"
					+ "2 - information about the train;\r\n" + "3 - sorting trains by destination;\r\n" + "4 - exit.");
		}
		}
	}

	public static void sortdestination(List trains) {
		Collections.sort(trains, new DestinationNameComparator());
		System.out.println("Schedule sorted by destination: \n" + trains);
	}

	public static void informationtrain(List<Train> trains) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter train number:");
		int n = scan.nextInt();
		for (Train train : trains) {
			if (train.number == n) {
				System.out.println("Information about the train;\r\n" + train.getNumber() + " Destination Name "
						+ train.destinationName + " Time " + train.time);
			}
		}
	}

	public static void fullschedule(List trains) {
		Collections.sort(trains, new TimeComparator());
		System.out.println("Full schedule: \n" + trains);
	}

	public static class Train implements Comparable<Train> {
		String destinationName;
		int number;
		LocalDateTime time;

		public Train(String destinationName, int number, LocalDateTime time) {
			this.destinationName = destinationName;
			this.number = number;
			this.time = time;
		}

		public String getDestinationName() {
			return destinationName;
		}

		public void setDestinationName(String destinationName) {
			this.destinationName = destinationName;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public LocalDateTime getTime() {
			return time;
		}

		public void setTime(LocalDateTime time) {
			this.time = time;
		}

		@Override
		public String toString() {
			return "Train [destinationName=" + destinationName + ", number=" + number + ", time=" + time + "]";
		}

		@Override
		public int compareTo(Train anotherTrain) {
			return this.number - anotherTrain.number;
		}
	}

	public static class DestinationNameComparator implements Comparator<Train> {

		@Override
		public int compare(Train train1, Train train2) {
			int res = train1.destinationName.compareTo(train2.destinationName);
			return res;
		}
	}

	public static class TimeComparator implements Comparator<Train> {

		@Override
		public int compare(Train train1, Train train2) {
			int res = train1.time.compareTo(train2.time);
			return res;
		}
	}
}
