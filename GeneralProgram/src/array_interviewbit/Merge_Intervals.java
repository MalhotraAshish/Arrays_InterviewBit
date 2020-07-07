package array_interviewbit;

import java.util.ArrayList;

public class Merge_Intervals {

	public static void main(String args[]) {
		ArrayList<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(1,3));
		list.add(new Interval(6,9));
		ArrayList<Interval> result = new ArrayList<Interval>();
		result = insert(list, new Interval(2,5));
		for(int i = 0; i<result.size(); i++) {
			System.out.print("start = " + result.get(i).start + " end = " + result.get(i).end);
			System.out.println("");
		}
	}

	private static ArrayList<Interval> insert(ArrayList<Interval> list, Interval interval) {
		//check in list for which interval end is greater than start of merging interval
		// check in list for which interval end/start is greater than end of merging interval
		//keep adding required data to result list;
		Interval interval2 = new Interval();
		ArrayList<Interval> result = new ArrayList<Interval>();
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).start + list.get(i).end + interval.start<list.get(i).end);
			if(interval.start<list.get(i).end) {
				interval2.start = list.get(i).start;
				break;
			}else {
				result.add(list.get(i));
			}
		}
		for(int i = 0; i<list.size(); i++) {
			if(interval.end<list.get(i).end) {
				interval2.end = list.get(i).end;
				result.add(interval2);
				break;
			}else {
				result.add(list.get(i));
			}
		}
		return result;
	}

}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}
