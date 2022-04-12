package co.edu.loop;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int randomVal =(int) (Math.random() * 3) + 1;
		
		System.out.println("가위(1), 바위(2), 보(3)");
		int me = scanner.nextInt();
		
		while(true) {
			if (randomVal == 1) {
				System.out.println("com : 가위!");
			} else if (randomVal == 2) {
				System.out.println("com : 바위!");
			} else {
				System.out.println("com : 보!");
			}
			if (randomVal == me ) {
				System.out.println("비겼다!");
				break;
			} else if (randomVal > me) {
				System.out.println("졌다!");
				break;
			}else {
				System.out.println("이겼다!");
				break;
			}
		}
		scanner.close();
	}

}
