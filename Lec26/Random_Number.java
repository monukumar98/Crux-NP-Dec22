package Lec26;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lo = 10;
		int hi = 100;
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			int num = r.nextInt(hi - lo + 1) + lo;
			System.out.print(num + " ");
		}

	}

}
