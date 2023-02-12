package Lec14;

public class String_Alloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hellobye";
		String str1 = "hello";
		String str2 = new String("hellobye");
		String str3 = new String("hello");
		String s = "hye";
		String s1 = "bye";
		s = s + s1;//
		String s2 = "hello" + "bye";
		String s3 = "hello" + "bye";
		System.out.println(str2 == s2);
	}

}
