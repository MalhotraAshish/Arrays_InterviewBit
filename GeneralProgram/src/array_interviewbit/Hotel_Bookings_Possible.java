package array_interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class Hotel_Bookings_Possible {
	
	public static void main(String args[]) {
		ArrayList<Integer> arrive = new ArrayList<Integer>();
		ArrayList<Integer> depart = new ArrayList<Integer>();
		int k = 2;
		
		arrive.add(1);
		arrive.add(2);
		arrive.add(3);
		arrive.add(4);
		
		depart.add(10);
		depart.add(2);
		depart.add(6);
		depart.add(14);
		
		System.out.println(possibility(arrive, depart, k));
		
	}

	private static int possibility(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		Collections.sort(arrive);
	    Collections.sort(depart);
	    
	    int i = 0;
	    int j = 0;
	    
	    while(i<arrive.size() && j<depart.size()){
	        if(arrive.get(i)<depart.get(j)){
	            i++;
	            K--;
	        }else if(arrive.get(i)==depart.get(j)){
	            i++;
	            j++;
	        }else{
	            j++;
	            K++;
	        }
	        
	        if(K<0)
	            return 0;
	    }
	    return 1;
	}
	
}
