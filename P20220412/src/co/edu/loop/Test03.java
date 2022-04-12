package co.edu.loop;

public class Test03 {

	public static void main(String[] args) {

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
