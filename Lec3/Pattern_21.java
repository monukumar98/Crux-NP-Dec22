package Lec3;

public class Pattern_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		int space = 2 * n - 3;
		int row = 1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if (row == n) {
				k = 2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			row++;
			space -= 2;
			star++;
		}

	}

}
