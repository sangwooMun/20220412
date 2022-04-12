package co.edu.loop;

import java.util.Scanner;

public class WhileExample4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randomVal =(int) (Math.random() * 10) +1;
		
		while(true) {
			System.out.println("1 ~ 10 중 하나를 골라주세요.");
			int userVal = scanner.nextInt();
			if(randomVal == userVal) {
				System.out.println("정답입니다.");
				break;
			} else if (userVal > randomVal) {
				System.out.println("다운");
			} else {
				System.out.println("업");
			}
		}
		System.out.println("정답은 : " + randomVal);
		scanner.close();
	}

}
