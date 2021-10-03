package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 14;
		boolean flag = false;
		int m = a / 2;

		for (int i = 2; i < m; i++) {
			if (a % i == 0) {
				flag = true;
				break;
			} 
		}
		if (flag == true) {
			System.out.println("Entered Number is Not a Prime Number");
		} else {
			System.out.println("Entered Number is a Prime Number");
		}
	}
}
