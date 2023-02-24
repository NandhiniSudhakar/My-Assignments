package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {3,2,11,4,6,7,2,3,3,6,7};
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		  for (int j = 0; j < input.length; j++) {  
			  
			  set.add(input[j]);
		  }
		  List<Integer> list = new ArrayList<Integer>(set);
			System.out.println("FindSecondLargestInCollection\t" + list);
			System.out.println("FindSecondLargestInCollection\t" + list.get(list.size() -2));
		}

	  
	}
