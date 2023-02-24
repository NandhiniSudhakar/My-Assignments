package week3.day2;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

//		get the length of the array		
		int len = input.length;
		
//		sort the array			
		Collections.sort(Arrays.asList(input));
//		Iterate it in the reverse order
		for(int i=input.length-1; i>-1; i--) {
			System.out.println(input[i]);
		}
//		print the array
		
//		Required Output: Wipro, HCL , CTS, Aspire Systems

	}

	}


