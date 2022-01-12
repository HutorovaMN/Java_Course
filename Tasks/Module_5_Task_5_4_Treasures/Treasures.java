package Module_5_Task_5_4_Treasures;

/*ƒракон и его сокровища. 
 * —оздать программу, позвол€ющую обрабатывать сведени€ о 100 сокровищах в пещере
 *  дракона. 
 *  –еализовать возможность просмотра сокровищ,
 *   выбора самого дорогого по стоимости сокровища и 
 *   выбора сокровищ на заданную сумму.*/

public abstract class Treasures implements Comparable<Treasures> {
	protected int id;
	protected String name;
	protected int price;

	public Treasures(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Treasures [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public int compareTo(Treasures anotherTreasures) {
		return this.price - anotherTreasures.price;
	}
}
