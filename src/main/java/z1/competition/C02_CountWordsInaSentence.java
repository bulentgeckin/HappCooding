package z1.competition;

public class C02_CountWordsInaSentence {

	public static void main(String[] args) {

		String str = "Life is short time is fast";
		System.out.println(str);
		String[] words = str.split(" ");

		for (String x : words)
			System.out.println(x);

	}

}
