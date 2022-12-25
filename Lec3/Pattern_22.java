package Lec3;

public class Pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		int space = -1;
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
			// star
			int k = 1;
			if (row == 1) {
				k = 2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			row++;
			System.out.println();
			star--;
			space += 2;

		}
	}

}
