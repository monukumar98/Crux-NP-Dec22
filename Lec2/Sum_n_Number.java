package Lec2;

import java.util.Scanner;

public class Sum_n_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i;
			i++;
		}

		System.out.println(sum);

	}

}
