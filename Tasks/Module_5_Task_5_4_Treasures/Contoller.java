package Module_5_Task_5_4_Treasures;
/*«адача 4.
—оздать консольное приложение, удовлетвор€ющее следующим требовани€м:
Х ѕриложение должно быть объектно-, а не процедурно-ориентированным.
Х  аждый класс должен иметь отражающее смысл название и информативный состав.
Х Ќаследование должно примен€тьс€ только тогда, когда это имеет смысл.
Х ѕри кодировании должны быть использованы соглашени€ об оформлении кода java code convention.
Х  лассы должны быть грамотно разложены по пакетам.
Х  онсольное меню должно быть минимальным.
Х ƒл€ хранени€ данных можно использовать файлы.
ƒракон и его сокровища. —оздать программу, позвол€ющую обрабатывать сведени€ о 100 сокровищах в пещере дракона. 
–еализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Contoller {

	public static void main(String[] args) {
		Cave cave = new Cave();
		ArrayList<Treasures> treasures = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		Gold gold1 = new Gold(1, "Gold crown", 1000);
		Gold gold2 = new Gold(2, "Gold necklace", 900);
		Gold gold3 = new Gold(3, "Gold bracelet", 800);
		Gold gold4 = new Gold(4, "Gold ring", 700);
		Gold gold5 = new Gold(5, "Gold coin", 600);

		Silver silver1 = new Silver(6, "Silver crown", 500);
		Silver silver2 = new Silver(7, "Silver necklace", 400);
		Silver silver3 = new Silver(8, "Silver bracelet", 300);
		Silver silver4 = new Silver(9, "Silver ring", 200);
		Silver silver5 = new Silver(10, "Silver coin", 100);

		Bronze bronze1 = new Bronze(11, "Bronze crown", 90);
		Bronze bronze2 = new Bronze(12, "Bronze necklace", 80);
		Bronze bronze3 = new Bronze(13, "Bronze bracelet", 70);
		Bronze bronze4 = new Bronze(14, "Bronze ring", 60);
		Bronze bronze5 = new Bronze(15, "Bronze coin", 50);

		treasures.add(bronze5);
		treasures.add(bronze4);
		treasures.add(bronze3);
		treasures.add(bronze2);
		treasures.add(bronze1);
		treasures.add(silver5);
		treasures.add(silver4);
		treasures.add(silver3);
		treasures.add(silver2);
		treasures.add(silver1);
		treasures.add(gold5);
		treasures.add(gold4);
		treasures.add(gold3);
		treasures.add(gold2);
		treasures.add(gold1);

		System.out.println("Hello Friend!\r\n" + "Choose a number:\r\n" + "1 - see all the treasures;\r\n"
				+ "2 - put treasures in your bag;\r\n" + "3 - show the dearest treasure;\r\n"
				+ "4 - sort my treasures by price;\r\n" + "5 - leave the cave.");
		int n = scan.nextInt();
		if (n == 1) {
			cave.displayTreasures(treasures);
		} else if (n == 2) {
			cave.selectionTreasures(treasures);
			System.out.println("Want to pick more treasures? 1 -yes 2 - no");
			int x = scan.nextInt();
			while (x == 1) {
				if (x == 1) {
					cave.selectionTreasures(treasures);
					System.out.println("Want to pick more treasures? 1 -yes 2 - no");
					x = scan.nextInt();
				} else {
					System.exit(2);
				}
			}
		} else if (n == 3) {
			cave.dearestTreasure(treasures);
		} else if (n == 4) {
			cave.sortTreasures(treasures);
		} else if (n == 5) {
			System.exit(5);
		}
	}
}
