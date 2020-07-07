package array_interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class Wave_Array {

	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list = wait(list);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static ArrayList<Integer> wait(ArrayList<Integer> list) {
		Collections.sort(list);
		for(int i = 0; i<list.size()-1; i = i+2) {
			int temp = list.get(i);
			list.set(i, list.get(i+1));
			list.set(i+1, temp);
		}
		return list;
	}
	
}
