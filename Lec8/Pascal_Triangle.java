package Lec8;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrintPattern(n);

	}

	public static void PrintPattern(int n) {
		int star = 0;
		int row = 0;
		while (row < n) {
			int i = 0;
			int val = 1;
			while (i <= star) {
				System.out.print(val + " ");
				val = ((row - i) * val) / (i + 1);
				i++;
			}
			star++;
			row++;
			System.out.println();
		}

	}

}
