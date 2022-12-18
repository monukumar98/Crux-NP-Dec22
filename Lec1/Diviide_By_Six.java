package Lec1;

import java.util.Scanner;

public class Diviide_By_Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0 && n % 3 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

}
