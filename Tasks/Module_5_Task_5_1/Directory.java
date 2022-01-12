package Module_5_Task_5_1;

import java.nio.file.*;
import java.util.Scanner;

public class Directory {
	private Path path;

	public Directory(String path) {
		this.path = createDirectory(path);
	}

	// создание директории
	public Path createDirectory(String path) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Введите директорию: d://Temp// ");
			path = scan.nextLine();
		}
		if (Files.exists(Paths.get(path))) {
			System.out.println("Директория \"" + path + "\" уже существует.");
			return Paths.get(path);
		} else {
			try {
				System.out.println("Директория \"" + path + "\" создана.");
				return Files.createDirectory(Paths.get(path));
			} catch (Exception e) {
				System.out.println("Директория не создана:" + e);
				return null;
			}
		}
	}

	public Path getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = Paths.get(path);
	}
}