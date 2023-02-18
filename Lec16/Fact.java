package Lec16;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		System.out.println(fact(n));

	}

	public static int fact(int n) {
		//base case
		if(n==0) {
			return 1;
		}
		//int fn = fact(n - 1);// sp
		return n * fact(n - 1);// sp

	}

}
