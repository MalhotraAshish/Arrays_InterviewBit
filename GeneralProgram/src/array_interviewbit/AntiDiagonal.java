package array_interviewbit;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonal {
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		list = antiDiagonal(list);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static ArrayList<ArrayList<Integer>> antiDiagonal(ArrayList<ArrayList<Integer>> list) {
		int row = 0, col = 0;
		
		ArrayList<ArrayList<Integer>> new_list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> subList = new ArrayList<Integer>();
		for(int i = 0; i<list.size(); i++) {
			row = 0; col = i;
			subList = new ArrayList<Integer>();
			while(col>=row) {
				subList.add(list.get(row).get(col));
				row++; col--;
			}
			new_list.add(subList);
		}
		for(int i = 0; i<list.size(); i++) {
			row = i;
			col = list.size()-1;
			subList = new ArrayList<Integer>();
			while(row<col) {
				subList.add(list.get(row).get(col));
				row++; col--;
			}
			new_list.add(subList);
		}
		return new_list;
	}
}
