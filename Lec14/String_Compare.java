package Lec14;

public class String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ankit";
		String s2 = "ankita";
//		if(Compareto(s1, s2)>0) {
//			System.out.println(s1);
//		}
//		else {
//			System.out.println(s2);
//		}
		System.out.println(s1.compareTo(s2));
	}

	public static int Compareto(String s1, String s2) {
		int len = Math.min(s1.length(), s2.length());
		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}

		}
		return s1.length() - s2.length();

	}

}
