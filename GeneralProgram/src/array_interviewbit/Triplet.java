package array_interviewbit;

import java.util.ArrayList;

public class Triplet {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("0.1");
		list.add("0.3");
		list.add("0.4");
		list.add("1.4");
		
		System.out.println(triplet(list));
	}

	private static int triplet(ArrayList<String> list) {
		double a = Double.parseDouble(list.get(0));
		double b = Double.parseDouble(list.get(1));
		double c = Double.parseDouble(list.get(2));
		
		for(int i = 3; i<list.size(); i++) {
			if((a+b+c)>1 && (a+b+c)<2) {
				return 1;
			}
			else if(a+b+c>=2) {
				if(a > b && a > c) {
					a = Double.parseDouble(list.get(i));
				}else if(b>c) {
					b = Double.parseDouble(list.get(i));
				}else {
					c = Double.parseDouble(list.get(i));
				}
			}else {
				if(a < b && a < c) {
					a = Double.parseDouble(list.get(i));
				}else if(b<c) {
					b = Double.parseDouble(list.get(i));
				}else {
					c = Double.parseDouble(list.get(i));
				}
			}
		}
		if((a+b+c)>1 && (a+b+c)<2) {
			return 1;
		}
		return 0;
	}
}
