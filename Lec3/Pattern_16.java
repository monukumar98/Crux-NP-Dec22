package Lec3;

public class Pattern_16 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int star = n;
		int space = n - 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			if (row < n) {
				star--;
				space--;
			} else {
				star++;
				space++;
			}
			System.out.println();
			row++;
		}
	}
}
