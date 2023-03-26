package Lec26;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		PrimeSieve(n);

	}

// jis index pe false aagya iska mtlb index prime hai 
	public static void PrimeSieve(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;// prime number nhi h
		prime[1] = true;// prime number nhi h

		for (int i = 2; i * i <= prime.length; i++) {
			if (prime[i] == false) {
				for (int j = 2; j * i < prime.length; j++) {
					prime[j * i] = true;// marked prime nhi hai
				}
			}

		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) {
				System.out.print(i + " ");
			}
		}

	}

}
