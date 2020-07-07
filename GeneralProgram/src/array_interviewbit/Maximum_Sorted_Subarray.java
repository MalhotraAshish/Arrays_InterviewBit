package array_interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Maximum_Sorted_Subarray {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(15);
		list.add(4);
		list.add(4);
		list.add(15);
		list.add(18);
		list.add(20);
		System.out.println(subUnsort(list));
	}

	private static ArrayList<Integer> subUnsort(ArrayList<Integer> list) {
		int left = 0, right = 0;
		int arr[] = new int[list.size()];
		for(int i = 0; i<list.size(); i++) {
			arr[i] = list.get(i);
		}
		Arrays.sort(arr);
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) != arr[i]) {
				left = i;
				break;
			}
		}
		for(int i = list.size()-1; i>=0; i--) {
			if(list.get(i) != arr[i]) {
				right = i;
				break;
			}
		}

		if (left == 0 && right == 0) {
			result.add(-1);
		} else {
			result.add(left);
			result.add(right);
		}
		return result;
	}

}
