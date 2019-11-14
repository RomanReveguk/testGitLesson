package Dz;

public class ArrayOfStrings {

	public static void ArrayString(String[] string) { 

		for (int i = 0; i < string.length; i++) {
			if (string[i].length() > 3) {
				System.out.println(string[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] string = { "строка", "слово", "сл", "во", "слов","с","огромный" };

		ArrayString(string);

	}
}
