package Module_4_Task_4_7_Triangle;

import java.util.Scanner;

public class Task_4_7_Triangle {
	/*
	 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
	 * объектов, вычисления площади, периметра и точки пересечения медиан.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter coordinates for the side of the triangle x");
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double x = Math.sqrt(x1 * x1 + x2 * x2);
		System.out.println("Enter coordinates for the side of the triangle y");
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double y = Math.sqrt(y1 * y1 + y2 * y2);
		System.out.println("Enter coordinates for the side of the triangle z");
		double z1 = scan.nextDouble();
		double z2 = scan.nextDouble();
		double z = Math.sqrt(z1 * z1 + z2 * z2);
		Triangle triangle = new Triangle(x, y, z);
		System.out.println("perimeter : "+triangle.perimeter(x, y, z));
		System.out.println("triangle : "+triangle.square(x, y, z, triangle.perimeter(x, y, z)));
		System.out.println("xA1 : "+triangle.median(y1, z1));
		System.out.println("yA1 : "+triangle.median(y2, z2));
		System.out.println("xB1 : "+triangle.median(x1, z1));
		System.out.println("yB1 : "+triangle.median(x2, z2));
	}
}

class Triangle {
	double x;
	double y;
	double z;

	public Triangle(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double perimeter(double x, double y, double z) {
		return x + y + z;
	}

	public double square(double x, double y, double z, double p) {
		p = p / 2;
		return Math.sqrt(p * (p - x) * (p - y) * (p - z));
	}

	public double median(double x1, double z1) {
		return (x1+z1)/2;
	}
}