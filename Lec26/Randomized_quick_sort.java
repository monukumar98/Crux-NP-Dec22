package Lec26;

import java.util.Random;

public class Randomized_quick_sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 3, 8, 1, 4 };

		Sort(arr, 0, arr.length - 1);

	}

	public static void Sort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if (si >= ei) {
			return;
		}

		int idx = Partition(arr, si, ei);
		Sort(arr, si, idx - 1);
		Sort(arr, idx + 1, ei);

	}

	public static int Partition(int[] arr, int si, int ei) {

		Random(arr, si, ei);
		int item = arr[ei];
		int idx = si;

		for (int i = si; i < ei; i++) {
			if (arr[i] <= item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;

	}

	public static void Random(int[] arr, int si, int ei) {
		Random r = new Random();
		int ii = r.nextInt(ei - si + 1) + si;
		int temp = arr[ei];
		arr[ei] = arr[ii];
		arr[ii] = temp;

	}
}
