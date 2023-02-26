package Lec17;

public class Print_SuqSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		Subsequnce(ques, "");

	}

	
	public static void Subsequnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			
			return;
		}

		char ch = ques.charAt(0);
		Subsequnce(ques.substring(1), ans);
		Subsequnce(ques.substring(1), ans + ch);

	}
}
