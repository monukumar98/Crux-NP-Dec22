package Lec6;

import java.util.Scanner;

public class Data_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b =  (byte)(300);
		int i = 3;
		short s = 3;
		long l = 3546577765l;
		byte b1 = 5;
		b=(byte) (i);
		i=b;
		System.out.println(b);
		Scanner sc = new Scanner(System.in);
		i=sc.nextInt();
		l=sc.nextLong();
		b=sc.nextByte();
		s=sc.nextShort();

	}

}
