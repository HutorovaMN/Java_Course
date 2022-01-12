package Module_4_Task_4_2;

public class Student {
	public String name;
	public int numberGR;
	public int[] progress = new int[4];

	public Student(String name, int numberGR, int[] progress) {
		this.name = name;
		this.numberGR = numberGR;
		this.progress = progress;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int numberGR() {
		return numberGR;
	}

	public void numberGR(int numberGR) {
		this.numberGR = numberGR;
	}

	public int[] progress() {
		return progress;
	}

	public void progress(int[] progress) {
		this.progress = progress;
	}
}
