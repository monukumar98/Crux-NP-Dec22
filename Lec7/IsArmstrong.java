package Lec7;

import java.util.Scanner;

public class IsArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Is_Armstrong(n));

	}

	public static boolean Is_Armstrong(int n) {
		int c = CountofDigit(n);
		int sum=0;
		int a=n;
		while(n!=0) {
			int rem = n%10;
			sum = (int) (sum + Math.pow(rem, c));
			n=n/10;
		}
		if(sum==a) {
			return true;
		}
		else {
			return false;
		}

	}

	public static int CountofDigit(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

}
