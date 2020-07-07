package array_interviewbit;

import java.util.ArrayList;
import java.util.Arrays;

public class Max_Non_Negative_Sub_Array {
	public static void main(String args[]) {
		int arr[] = {10, -1, 2, 3, -4, 100};
		System.out.println(Arrays.toString(simulation(arr)));
	}

	private static int[] simulation(int[] arr) {
		long max_sum = Long.MIN_VALUE;
		ArrayList<Integer> maxArray = new ArrayList<Integer>();
		int temp_sum = 0;
		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]>=0) {
				temp_sum = temp_sum + arr[i];
				tempArr.add(arr[i]);
			}else {
				temp_sum = 0;
				tempArr = new ArrayList<Integer>();
			}
			if(max_sum < temp_sum) {
				max_sum = temp_sum;
				maxArray = tempArr;
			}
		}
		int[] subarr = new int[maxArray.size()];
		for(int i = 0; i<maxArray.size(); i++) {
			subarr[i] = maxArray.get(i);
		}
		return subarr;
	}
}
