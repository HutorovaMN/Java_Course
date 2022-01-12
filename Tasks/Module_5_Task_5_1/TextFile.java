package Module_5_Task_5_1;

import java.io.*;
import java.nio.file.*;

public class TextFile {
	private String text;
	private MyFile myFile;

	public TextFile(String text, MyFile myFile) {
		this.text = text;
		this.myFile = myFile;
	}

	// creating a text file
	public Path createTextFile() {
		try {
			return Files.writeString(myFile.getFilePath(), text);
		} catch (Exception e) {
			System.out.println("The text file has not been created: " + e);
			return null;
		}
	}

	// renaming a file
	public void renameFile(String newName) {

		File original = myFile.getFilePath().toFile();
		File newFile = null;
		try {
			newFile = myFile.getDirectory().getPath().resolve(newName + '.' + myFile.getType()).toFile();
		} catch (InvalidPathException e) {
			System.out.println("The new file name was entered incorrectly: " + e);
		}
		// проверка переименования файла
		try {
			if (original.exists() && original.isFile() && original.canWrite()) {
				if (original.renameTo(newFile)) {
					System.out.println("The file was renamed successfully.");
					myFile.setFilePath(newFile.toPath());
					myFile.setName(newName);
				} else {
					System.out.println("The file has not been renamed.");
				}
			} else {
				System.out.println("The file has not been renamed.");
			}
		} catch (NullPointerException e) {
			System.out.println("The file has not been renamed: " + e);
		}
	}

	// вывод в консоль содержимого текстового файла
	public void printTextFile() {
		StringBuilder text = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(myFile.getFilePath().toString()))) {
			String str = reader.readLine();
			while (str != null) {
				text.append(str);
				text.append(System.lineSeparator());
				str = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("File output error to the console: " + e);
		}
		System.out.println("File Contents \"" + myFile.getFilePath().toString() + "\":\n" + text.toString());
	}

	// adding text to an existing text file
	public void addText(String textAdd) {
		try {
			Path filePath = Files.writeString(myFile.getFilePath(), textAdd, StandardOpenOption.APPEND);
			myFile.setFilePath(filePath);
			System.out.println("The text has been successfully added to the file \"" + myFile.getName() + '.' + myFile.getType() + "\".");
		} catch (NullPointerException | IOException e) {
			System.out.println("The text is not added to the file: " + e);
		}
	}

	// deleting file text
	public void deleteText() {
		try {
			Path filePath = Files.writeString(myFile.getFilePath(), "");
			myFile.setFilePath(filePath);
			System.out
					.println("File Contents \"" + myFile.getName() + '.' + myFile.getType() + "\" successfully deleted.");
		} catch (NullPointerException | IOException e) {
			System.out.println("Error deleting file contents: " + e);
		}
	}

	// deleting a text file
	public void deleteFile() {
		File file = myFile.getFilePath().toFile();
		String nameFile = myFile.getName() + '.' + myFile.getType();
		if (file.delete()) {
			System.out.println("The file \"" + nameFile + "\" successfully deleted.");
		} else {
			System.out.println("The file \"" + nameFile + "\" not detected.");
		}
	}
}