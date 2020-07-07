package array_interviewbit;

import java.util.ArrayList;

public class Pascal_Triangle {
	public static void main(String args[]) {
		int num = 0;
		ArrayList<ArrayList<Integer>> list = pascalTriangle(num);
		for(int i = 0; i<num; i++) {
			System.out.println(list.get(i));
		}
		
	}

	private static ArrayList<ArrayList<Integer>> pascalTriangle(int num) {
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> subList = new ArrayList<Integer>();
		if(num == 0) {
			return null;
		}
		if(num == 1) {
			subList.add(1);
			mainList.add(subList);
			return mainList;
		}
		if(num == 2) {
			subList.add(1);
			mainList.add(subList);
			subList = new ArrayList<Integer>();
			subList.add(1);
			subList.add(1);
			mainList.add(subList);
			return mainList;
		}
		subList.add(1);
		mainList.add(subList);
		subList = new ArrayList<Integer>();
		subList.add(1);
		subList.add(1);
		mainList.add(subList);
		for(int i = 2; i<num; i++) {
			subList = new ArrayList<Integer>();
			for(int j = 0; j<=i; j++) {
				if(j == 0) {
					subList.add(1);
				}else if(j==i) {
					subList.add(1);
				}else {
					subList.add((mainList.get(i-1).get(j-1) + mainList.get(i-1).get(j)));
				}
			}
			mainList.add(subList);
		}
		return mainList;
		
	}
}
