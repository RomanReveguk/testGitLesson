package Dz;

import java.util.Scanner;

public class MyApp3 {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);

		System.out.println("Введите радиус r: ");
		
		double r = n.nextDouble();
		double leng;
		leng = 2*Math.PI*r;
		
		System.out.println("Длина окружности = "+ leng);
			
		
	}

}
