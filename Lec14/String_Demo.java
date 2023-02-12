package Lec14;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = new String("hello");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str == str2);
		System.out.println(str == str3);
		System.out.println(str3 == str2);
		System.out.println(str1 == str);
//		if (str == str2) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("no");
//		}

	}

}
