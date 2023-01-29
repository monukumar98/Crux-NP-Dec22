package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int noc = sc.nextInt();// number of cows
			int[] stall = new int[n];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(largest_minimum_distance(stall, noc));
			t--;
		}

	}

	public static int largest_minimum_distance(int[] stall, int noc) {
		int lo = 0;
		int hi = stall[stall.length - 1];
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(stall,noc,mid)==true) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] stall, int noc, int mid) {
		// TODO Auto-generated method stub
		
		int c=1;
		int pos=stall[0];
		for (int i = 1; i < stall.length; i++) {
			if(stall[i]-pos>=mid) {
				c++;
				pos=stall[i];
			}
			if(c==noc) {
				return true;
			}
		}
		return false;
	}
	

}
