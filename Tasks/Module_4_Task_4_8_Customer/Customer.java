package Module_4_Task_4_8_Customer;

import java.util.Comparator;
import java.util.List;

/*
 * —оздать класс Customer, спецификаци€ которого приведена ниже. ќпределить
 * конструкторы, set- и get- методы и метод toString(). —оздать второй класс,
 * агрегирующий массив типа Customer, с подход€щими конструкторами и методами.
 * «адать критерии выбора данных и вывести эти данные на консоль.  ласс
 * Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер
 * банковского счета. Ќайти и вывести: a) список покупателей в алфавитном
 * пор€дке; b) список покупателей, у которых номер кредитной карточки находитс€
 * в заданном интервале
 */
public class Customer implements Comparable<Customer> {
	int id;
	String lastname;
	String firstname;
	String patronymic;
	String address;
	int creditcardnumber;
	int bankaccountnumber;

	/**
	 * @param id
	 * @param lastname
	 * @param firstname
	 * @param patronymic
	 * @param address
	 * @param creditcardnumber
	 * @param bankaccountnumber
	 */
	public Customer(int id, String lastname, String firstname, String patronymic, String address, int creditcardnumber,
			int bankaccountnumber) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.patronymic = patronymic;
		this.address = address;
		this.creditcardnumber = creditcardnumber;
		this.bankaccountnumber = bankaccountnumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditcardnumber() {
		return creditcardnumber;
	}

	public void setCreditcardnumber(int creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}

	public int getBankaccountnumber() {
		return bankaccountnumber;
	}

	public void setBankaccountnumber(int bankaccountnumber) {
		this.bankaccountnumber = bankaccountnumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ", patronymic="
				+ patronymic + ", address=" + address + ", creditcardnumber=" + creditcardnumber
				+ ", bankaccountnumber=" + bankaccountnumber + "]";
	}

	@Override
	public int compareTo(Customer o) {
		return this.lastname.compareTo(o.lastname);
	}

	public static void cardinterval(List<Customer> list, int n, int m) {
		int count = 0;
		for (Customer c : list) {
			if (c.creditcardnumber >= n && c.creditcardnumber <= m) {
				System.out.println(c);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There are no credit cards with this number.");
		}
	}
}

class Cardnumber implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.creditcardnumber - o2.creditcardnumber;
	}

}
