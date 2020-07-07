package array_interviewbit;

import java.util.ArrayList;
import java.util.HashSet;

public class Find_Duplicate_in_Array {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(4);
		list.add(1);
		System.out.println(repeatedNumber(list));
	}

	private static int repeatedNumber(ArrayList<Integer> list) {
		HashSet<Integer> result = new HashSet<Integer>();
		for(int i = 0; i<list.size(); i++) {
			if(result.contains(list.get(i))) {
				return list.get(i);
			}else {
				result.add(list.get(i));
			}
		}
		return -1;
	}
}
