package co.edu.loop;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		while (run) {
			System.out.println("################################");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("################################");
			System.out.println("선택");
			int num = scanner.nextInt();

			if (num == 1) {
				System.out.println("예금하실 금액 : ");
				int money = scanner.nextInt();
				balance += money;
			} else if (num == 2) {
				System.out.println("출금하실 금액 :");
				int money = scanner.nextInt();
				if (balance < money) {
					System.out.println((money - balance) + "원 부족, 잔고가 부족합니다.");
				} else {
					balance -= money;
				}
			} else if (num == 3) {
				System.out.println("잔액확인 : " + balance);
			} else if (num == 4) {
				System.out.println("이용해주셔서 감사~");
				run = false;
			} else {
				System.out.println("잘못입력하쉼^^");
			}

		}
		System.out.println("프로그램 종료.");
		scanner.close();
	}

}
