package array_interviewbit;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_Matrix_Zeros {
	public static void main(String args[]) {
		ArrayList<Integer> sub_list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		sub_list.add(1);
		sub_list.add(0);
		sub_list.add(1);
		list.add(sub_list);
		sub_list = new ArrayList<Integer>();
		sub_list.add(1);
		sub_list.add(1);
		sub_list.add(1);
		list.add(sub_list);
		sub_list = new ArrayList<Integer>();
		sub_list.add(1);
		sub_list.add(1);
		sub_list.add(1);
		list.add(sub_list);
		
		list = setZeroes(list);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static ArrayList<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> list) {
		HashSet<Integer> row = new HashSet<Integer>();
		HashSet<Integer> col = new HashSet<Integer>();
		for(int i = 0; i<list.size(); i++) {
			for(int j = 0; j<list.get(i).size(); j++ ) {
				if(list.get(i).get(j) == 0) {
					row.add(i);
					col.add(j);
				}
			}
		}
		
		for(int i = 0; i<list.size(); i++) {
			for(int j = 0; j<list.get(i).size(); j++) {
				if(row.contains(i) || col.contains(j)) {
					list.get(i).set(j, 0);
				}
			}
		}
		
		return list;
	}
}
