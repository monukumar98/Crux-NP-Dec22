package Lec14;

public class String_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = "hello";
		String str2 = new String("hello");
		System.out.println(str.length());
		System.out.println(str2=="hello");
		System.out.println(str.equals(str1));
	}
	public static boolean equals(String s1, String s2) {
		if (s1 == s2) {
			return true;
		}
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i <s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;

	}

}
