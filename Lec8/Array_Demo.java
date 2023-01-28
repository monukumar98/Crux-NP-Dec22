package Lec8;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];
		System.out.println(arr);
		System.out.println(arr.length);
//		int a=9;
//		int b =a;
		int[] other = arr;
		// get
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		arr[3]=-9;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
