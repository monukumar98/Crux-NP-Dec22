package Lec12;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5, 7, 8, 9, 11, 13, 14, 16, 17, 18 };
		System.out.println(Search(arr, 13));

	}

	public static int Search(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] < item) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;

	}

}
