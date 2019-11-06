package Dz;

import java.util.Scanner;

public class NumberOfWordsInLine {

	static int count = 0;

	public static void NumberWords(String string) {
		String str = new String(string);

		for (String strr : str.split("\\s*(\\s|,|!|\\.)\\s*")) {
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberWords(sc.nextLine());   //Вводим строку через консоль

	}

}
