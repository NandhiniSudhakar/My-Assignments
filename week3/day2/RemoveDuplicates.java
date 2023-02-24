package week3.day2;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class RemoveDuplicates {

		
		static void removeDuplicate(char str[], int n)
	    {
	     
	        HashSet<Character> hs = new LinkedHashSet<Character>(n - 1);
	     
	        
	        for (char y : str)
	            hs.add(y);
	 
	      
	        for (char y : hs)
	            System.out.print(y);
	    }
		 public static void main(String[] args)
		    {
		        char str[] = "PayPal India".toCharArray();
		        int n = str.length;
		 
		        removeDuplicate(str, n);
		    }
			


		
		

	}


	


