package array_interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class Nobal_Number {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-4);
		list.add(-2);
		list.add(0);
		list.add(-1);
		list.add(-6);
		
		System.out.println(nobalNumber(list));
		
	}

	private static int nobalNumber(ArrayList<Integer> list) {
		Collections.sort(list);
		System.out.println(list);
		if(list.get(list.size()-1) == 0) {
			return 1;
		}
		for(int i = 0; i<list.size()-1; i++) {
			if(list.get(i) == list.get(i+1)) {
				continue;
			}
			if(list.get(i) == ((list.size()-1) -i)) {
				return 1;
			}
		}
		return -1;
	}
}
