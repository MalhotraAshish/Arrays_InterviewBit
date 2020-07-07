package array_interviewbit;

import java.util.ArrayList;

public class Kth_row_Pascal_Triangle {
	public static void main(String args[]) {
		int k = 5;
		System.out.println(rowOfPascleTriangle(k));
	}

	private static ArrayList<Integer> rowOfPascleTriangle(int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(k == 0) {
			list.add(1);
			return list;
		}else if(k == 1) {
			list.add(1);
			list.add(1);
			return list;
		}else {
			list.add(1);
			for(int i = 1; i<=k; i++) {
				list.add(list.get(i-1) * ((k-i)+1)/i);
			}
			return list;
		}
		
	}
}
