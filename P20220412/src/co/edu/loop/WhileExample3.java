package co.edu.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randomVal =(int) (Math.random() * 10) +1;
		System.out.println("1 ~ 10 중 하나를 골라주세요.");
		int userVal = scanner.nextInt();
		
		boolean isTrue = true;
		
		while(isTrue) {
			if(userVal == randomVal) {
				System.out.println("비겼다.");
				isTrue = false;
				continue;
			} else if (userVal > randomVal) {
				System.out.println(randomVal);
				System.out.println("이겼다.");
				break;
			} else {
				System.out.println(randomVal);
				System.out.println("졌다.");
				break;
			}
		}
		scanner.close();
	}

}
