package Dz;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите высоту");
		int n = sc.nextInt();
		
		
		System.out.println("Введите ширину");
		int m = sc.nextInt();
		
	
		
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				if (Check(i, j, n, m)) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static boolean Check(int i, int j, int n, int m) {
		return i == 0 || i == n - 1 || j == 0 || j == m - 1;
	}

}
