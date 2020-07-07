package array_interviewbit;

import java.util.ArrayList;

public class MaxDistance {
	
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(2);
		System.out.println(findMaxDistance(list));
	}

	private static int findMaxDistance(ArrayList<Integer> list) {
		int globalMax = Integer.MIN_VALUE;
		int tempMax = Integer.MIN_VALUE;
		for(int i = 0; i<list.size(); i++) {
			for(int j = 1; j<list.size(); j++) {
				if(list.get(i)<=list.get(j)) {
					tempMax = Math.max(tempMax, (j-i));
				}
			}
			globalMax = Math.max(tempMax, globalMax);
		}
		return globalMax;
	}

}
