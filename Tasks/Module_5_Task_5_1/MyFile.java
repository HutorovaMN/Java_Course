package Module_5_Task_5_1;

import java.nio.file.*;
import java.util.Scanner;

public class MyFile {
	private String name;
	private String type;
	private Directory directory;
	private Path filePath;

	public MyFile(String name, String type, Directory directory) {
		this.name = name;
		this.type = type;
		this.directory = directory;
		this.filePath = createFile();
	}

	// creating a file
	public Path createFile() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the file name: testFile");
			name = scan.nextLine();
			System.out.println("Enter the file extension: txt");
			type = scan.nextLine();
		}
		String filePath = directory.getPath() + "\\" + name + '.' + type;
		try {
			System.out.println("File created " + name + '.' + type);
			return Files.createFile(Paths.get(filePath));
		} catch (FileAlreadyExistsException e) {
			System.out.println("File \"" + filePath + "\" already exists.");
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Path getFilePath() {
		return filePath;
	}

	public void setFilePath(Path filePath) {
		this.filePath = filePath;
	}
}