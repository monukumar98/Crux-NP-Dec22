package Lec15;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		// add
		list.add(1);
		list.add(-19);
		list.add(10);
//		System.out.println(list);
//		System.out.println(list.size());
		list.add(2, 20);
		System.out.println(list);
		
		// remove 
		System.out.println(list.remove(1));
		System.out.println(list);
		list.add(101);
		list.add(102);
		System.out.println(list);
		//get
		System.out.println(list.get(2));
		// sort
		Collections.sort(list);
		System.out.println(list);
		

	}

}
