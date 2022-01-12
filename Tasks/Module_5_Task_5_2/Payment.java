package Module_5_Task_5_2;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно
 * сформировать покупку из нескольких товаров.
 */
public class Payment {
	public String catalog;
	Payment.PaymentIn tovar[] = new Payment.PaymentIn[15];

	public Payment(String catalog) {
		this.catalog = catalog;
	}

	public static class PaymentIn {
		public String name;
		public int price, id;

		public PaymentIn(int id, String name, int price) {

			this.name = name;
			this.id = id;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "tovar " + name + ", price:" + price;
		}
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
}
