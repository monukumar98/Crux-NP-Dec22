package Lec5;

public class Sum_Of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3467;
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println(sum);

	}

}
