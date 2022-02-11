package Module_4_Task_4_12_Car;

import java.util.ArrayList;
import java.util.List;

/*Создать объект класса Автомобиль, используя классы 
 * Колесо, Двигатель. Методы: ехать, заправляться, менять колесо, 
 * вывести на консоль марку автомобиля.*/

public class Test {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		Car car1 = new Car("BMV", 345, 4);
		Car car2 = new Car("Mersedes", 400, 2);
		Car car3 = new Car("Tesla", 250, 4);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		Car.Drive();
		Car.ChangeWheel();
		Car.Refill();
		Car.CarBrand(cars);
	}

}
