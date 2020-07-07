package array_interviewbit;

import java.util.ArrayList;
import java.util.Arrays;

public class Spiral_Order_Matrix {
	public static void main(String args[]) {
		int A = 4;
		System.out.println(matrix(A));
		/*for(int i = 0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}*/
	}

	private static ArrayList<ArrayList<Integer>> matrix(int A) {
		int result[][] = new int[A][A];
		int index = 1, top = 0, bottom = (A-1), right = (A-1), left = 0;
		while(index<=(A*A)) {
			if(left>right) {
				break;
			}
			//Left to right
			for(int i = left; i<=right; i++) {
				result[top][i] = index++;
			}
			top++;
			if(top>bottom)
				break;
			//top to bottom
			for(int i = top; i<=bottom; i++) {
				result[i][right] = index++;
			}
			right--;
			if(right<left)
				break;
			//right to left
			for(int i = right; i>=left; i--) {
				result[bottom][i] = index++;
			}
			bottom--;
			if(bottom < top)
				break;
			//bottom to top 
			for(int i = bottom; i>=top; i--) {
				result[i][left] = index++;
			}
			left++;
		}
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> sublist = new ArrayList<>();
		for(int i = 0; i<result.length; i++) {
			sublist = new ArrayList<>();
			for(int j = 0; j<result[i].length; j++) {
				sublist.add(result[i][j]);
			}
			list.add(sublist);
		}
		return list;
	}
}
