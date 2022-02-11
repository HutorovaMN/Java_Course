package Module_4_Task_4_11_Text;

import java.util.ArrayList;
import java.util.List;

public class Test {
	/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.
	 */
	public static void main(String[] args) {
		List<Text> listText = new ArrayList<>();
		Text.Sentence str1 = new Text.Sentence("Hello Word");
		Text.Word wrd1 = new Text.Word("Word");
		Text sen1 = new Text("Head1", str1, wrd1);
		listText.add(sen1);
		Text.AddText(listText);
		Text.PrintText(listText);
		Text.PrintHead(listText);
	}

}

class Text {
	String head;
	Sentence sentence;
	Word word;

	static public void AddText(List<Text> listText) {
		Text.Sentence str = new Text.Sentence("Hello Hello Word");
		Text.Word wrd = new Text.Word("Word Word");
		Text sen = new Text("Head", str, wrd);
		listText.add(sen);
	}

	static public void PrintText(List<Text> listText) {
		System.out.println(listText);
	}

	static public void PrintHead(List<Text> listText) {
		for (Text t : listText) {
			System.out.println(t.head + " ");
		}
	}

	public Text(String head, Sentence sentence, Word word) {
		super();
		this.head = head;
		this.sentence = sentence;
		this.word = word;
	}

	@Override
	public String toString() {
		return "Text [head=" + head + ", sentence=" + sentence + ", word=" + word + "]";
	}

	static public class Sentence {
		String str;

		public Sentence(String str) {
			this.str = str;
		}

		@Override
		public String toString() {
			return "Sentence [str=" + str + "]";
		}

	}

	static public class Word {
		String wrd;

		public Word(String wrd) {
			this.wrd = wrd;
		}

		@Override
		public String toString() {
			return "Word [wrd=" + wrd + "]";
		}

	}
}
