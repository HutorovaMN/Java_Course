package Module_5_Task_5_1;

import java.util.Scanner;

/*
������ 1.
������� ������ ������ ��������� ����, ��������� ������ ����, ����������. ������:
 �������, �������������, ������� �� ������� ����������, ���������, �������.
 */
public class Main {
	public static void main(String[] args) {
		Directory directory = new Directory("data/temp");
		MyFile myFile = new MyFile("text", "txt", directory);
		TextFile textFile = new TextFile(text, myFile);
		textFile.createTextFile();
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a new files name:");
			String newName = scan.nextLine();
			textFile.renameFile(newName);
		}
		textFile.printTextFile();
		textFile.addText(textAdd);
		textFile.deleteText();
		textFile.deleteFile();
	}

	static String text = "Enter your name.";
	static String textAdd = "My name is Maryna.";
}