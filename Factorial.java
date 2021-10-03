package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
		int s = 5;
		int fact = 1;

		for (int i = 1; i <= 5; i++) {
			int mul = fact * i;
			fact = mul;
		}
		System.out.println(fact);
	}

}
