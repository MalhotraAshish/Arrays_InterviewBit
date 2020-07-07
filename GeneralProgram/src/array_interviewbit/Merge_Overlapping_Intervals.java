package array_interviewbit;

import java.util.ArrayList;

public class Merge_Overlapping_Intervals {
	public static void main(String args[]) {
		ArrayList<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(1, 3));
		list.add(new Interval(2, 6));
		list.add(new Interval(8, 10));
		list.add(new Interval(15, 18));

		list = merge(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print("Start = " + list.get(i).start + " End = " + list.get(i).end);
			System.out.println("");
		}
	}

	private static ArrayList<Interval> merge(ArrayList<Interval> list) {
		ArrayList<Interval> result = new ArrayList<Interval>();
		if (list.size() <= 1) {
			return list;
		}
		sort(list, 0, list.size() - 1);
		Interval interval = list.get(0);
		result.add(interval);

		for (int i = 0; i < list.size(); i++) {
			int current_start = interval.start;
			int current_end = interval.end;
			int next_start = list.get(i).start;
			int next_end = list.get(i).end;

			if (current_end >= next_start) {
				interval.end = Math.max(current_end, next_end);
			} else {
				interval = list.get(i);
				result.add(interval);
			}
		}

		return result;
	}

	private static void sort(ArrayList<Interval> list, int l, int r) {

		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(list, l, m);
			sort(list, m + 1, r);

			// Merge the sorted halves
			merge(list, l, m, r);
		}
	}

	private static void merge(ArrayList<Interval> list, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		Interval L[] = new Interval[n1];
		Interval R[] = new Interval[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = list.get(l + i);
		for (int j = 0; j < n2; ++j)
			R[j] = list.get(m + 1 + j);

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i].start <= R[j].start) {
				list.set(k, L[i]);
				i++;
			} else {
				list.set(k, R[j]);
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			list.set(k, L[i]);
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			list.set(k,R[j]); 
			j++;
			k++;
		}

	}
}