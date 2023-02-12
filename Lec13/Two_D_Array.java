package Lec13;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);
		System.out.println(arr[0]);
		int[][] other = arr;
		int row = arr.length;// row
		int col = arr[0].length;// col
		arr[1][2]=-9;//value Update kra hu 
		for (int i = 0; i < arr.length; i++) {// row
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
