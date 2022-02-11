package Module_4_Task_4_12_Car;

import java.util.List;

public class Car {
	String brand;
	Engine engine;
	Door door;

	public Car(String brand, int horsePower, int doorCount) {
		super();
		this.brand = brand;
		this.engine = this.new Engine(horsePower);
		this.door = this.new Door(doorCount);
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + ", door=" + door + "]";
	}

	static void Refill() {
		System.out.println("Car refill");
	}

	static void Drive() {
		System.out.println("Car drive");
	}

	static void ChangeWheel() {
		System.out.println("Car change the wheel");
	}

	static void CarBrand(List<Car> cars) {
		System.out.println("Car brand");
		for (Car c : cars) {
			System.out.print(c.brand + " ");
		}
	}

	class Engine {
		int horsePower;

		public Engine(int horsePower) {
			super();
			this.horsePower = horsePower;
		}

		@Override
		public String toString() {
			return "Engine [horsePower=" + horsePower + "]";
		}
	}

	class Door {
		int doorCount;

		public Door(int doorCount) {
			super();
			this.doorCount = doorCount;
		}

		@Override
		public String toString() {
			return "Door [doorCount=" + doorCount + "]";
		}
	}
}
