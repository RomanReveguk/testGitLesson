package Dz;

import java.util.Scanner;

public class MyApp2 {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		System.out.println("Введите сторону а: ");
		double a = n.nextInt();
		System.out.println("Введите сторону b: ");
		double b = n.nextInt();

		System.out.println("Введите сторону c: ");
		double c = n.nextInt();

		double p = (a + b + c) / 2;
		System.out.println("Периметр равен = " + p);
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Площадь треугольника = " + s);
	}

}
