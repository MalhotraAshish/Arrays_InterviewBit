package array_interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class Maximum_Consecutive_Gap {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(5);
		
		System.out.println(maximumGap(list));
	}

	private static int maximumGap(final ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		Collections.sort(list);
		if(list.size()<2) {
			return 0;
		}
		for(int i = 1; i<list.size(); i++) {
			int sub = list.get(i) - list.get(i-1);
			max = Math.max(max, sub);
		}
		return max;
	}
}
