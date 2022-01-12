package Module_4_Task_4_2;

public class Test2 {

	/**
	 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
	 *  успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
	 *  Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
	 */

	public static void main(String[] args) {
		Student[] stud = new Student[10];
		stud[0] = new Student("Sidorov", 2, new int[] { 7, 4, 9, 7, 6 });
		stud[1] = new Student("Petrov", 3, new int[] { 9, 10, 9, 10, 9 });
		stud[2] = new Student("Ivanov", 3, new int[] { 9, 10, 9, 10, 9 });
		stud[3] = new Student("Hutorova", 1, new int[] { 9, 10, 5, 10, 9 });
		stud[4] = new Student("Sviridov", 2, new int[] { 9, 10, 7, 10, 9 });
		stud[5] = new Student("Statenko", 2, new int[] { 7, 4, 9, 7, 6 });
		stud[6] = new Student("Sladko", 3, new int[] { 9, 10, 9, 10, 9 });
		stud[7] = new Student("Murov", 3, new int[] { 9, 10, 6, 6, 9 });
		stud[8] = new Student("Dejko", 1, new int[] { 9, 10, 5, 10, 9 });
		stud[9] = new Student("Nosov", 2, new int[] { 9, 10, 9, 10, 9 });
		best(stud);

	}

	static void best(Student[] stud) {
		for (int i = 0; i < stud.length; i++) {
			int count = 0;
			for (int j = 0; j < stud[i].progress.length; j++) {

				if (stud[i].progress[j] < 8) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(stud[i].name + " " + stud[i].numberGR);
			}
		}
	}
}
