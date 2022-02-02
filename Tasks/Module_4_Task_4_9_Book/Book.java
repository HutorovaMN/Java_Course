package Module_4_Task_4_9_Book;

/*������� ����� Book, ������������ �������� ��������� ����. ���������� ������������,
 *  set- � get- ������ � ����� toString(). ������� ������ �����, ������������ ������ ���� Book, 
 *  � ����������� �������������� � ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.
����� � �������:
a) ������ ���� ��������� ������;
b) ������ ����, ���������� �������� �������������;
c) ������ ����, ���������� ����� ��������� ����.*/
public class Book {
	private int id;
	private String captionBook;
	private String author;
	private String publisher;
	private int yearPublication;
	private int numberPages;
	private int price;
	private String typeBinding;

	public Book(int id, String captionBook, String author, String publisher, int yearPublication, int numberPages,
			int price, String typeBinding) {
		super();
		this.id = id;
		this.captionBook = captionBook;
		this.author = author;
		this.publisher = publisher;
		this.yearPublication = yearPublication;
		this.numberPages = numberPages;
		this.price = price;
		this.typeBinding = typeBinding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCaptionBook() {
		return captionBook;
	}

	public void setCaptionBook(String captionBook) {
		this.captionBook = captionBook;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublication() {
		return yearPublication;
	}

	public void setYearPublication(int yearPublication) {
		this.yearPublication = yearPublication;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeBinding() {
		return typeBinding;
	}

	public void setTypeBinding(String typeBinding) {
		this.typeBinding = typeBinding;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", captionBook=" + captionBook + ", author=" + author + ", publisher=" + publisher
				+ ", yearPublication=" + yearPublication + ", numberPages=" + numberPages + ", price=" + price
				+ ", typeBinding=" + typeBinding + "]";
	}

}
