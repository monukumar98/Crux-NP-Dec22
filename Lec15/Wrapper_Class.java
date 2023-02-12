package Lec15;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a = 89;
		int a1 = 89;
		System.out.println(a);
		System.out.println(a1);
		a = a1;// Auto-Boxing
		int b = a;// unBoxing
		Integer a2 = 45;
		Integer a3 = 45;
		Integer b2 = 145;
		Integer b3 = 145;
		System.out.println(a2 == a3);
		System.out.println(b2 == b3);

	}

}
