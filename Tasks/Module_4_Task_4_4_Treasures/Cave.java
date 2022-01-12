package Module_4_Task_4_4_Treasures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cave {
	ArrayList<Treasures> bags = new ArrayList<>();

	public void displayTreasures(ArrayList<Treasures> treasures) {
		System.out.println("All treasures:");
		System.out.println(treasures);
	}

	public void selectionTreasures(ArrayList<Treasures> treasures) {
		System.out.println("Enter the number ID:");
		try (Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			for (Treasures s : treasures) {
				if (s.id == n) {
					bags.add(s);
				}
			}
		}
		System.out.println("Contents of your bag:");
		System.out.println(bags);
		int sum = bags.stream().filter(o -> o.getPrice() > 1).mapToInt(o -> o.getPrice()).sum();
		System.out.println("In your treasure bag worth:");
		System.out.println(sum);
	}

	public void dearestTreasure(ArrayList<Treasures> treasures) {
		Treasures max = treasures.get(0);
		for (Treasures s : treasures) {
			if (max.price < s.price) {
				max.price = s.price;
			}
		}
		System.out.println("My dearest treasure:");
		System.out.println(max);
	}

	public void sortTreasures(ArrayList<Treasures> treasures) {
		Collections.sort(treasures);
		System.out.println("Sorted treasures by price:");
		System.out.println(treasures);

	}

}
