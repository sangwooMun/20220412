package co.edu.loop;

import java.util.Scanner;

public class NestedExample {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int dan = scanner.nextInt();
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan + " X " + i + " = " + (dan * i));
//		}
		// 구구단 2 ~ 9.
//		for(int j=2; j<=9; j++) {
//			int dan1 = j;
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan1 + " X " + i + " = " + (dan1 * i));
//			}
//			System.out.println();
//		}
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = 1; j <= 5; j++) {
			for (int i = 5; i >= j; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int j = 1; j <= 5; j++) {
			for(int i=1; i<=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
