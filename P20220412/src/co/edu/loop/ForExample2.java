package co.edu.loop;

public class ForExample2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2; i <= 10; i++) {
			if(i% 2 == 0) {
				sum = sum + i;
			}
		}
	}

}
