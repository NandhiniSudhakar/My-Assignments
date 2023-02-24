package week3.day2;
import java.util.TreeSet;

public class MissingnumberusingTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] numbers = {1,2,3,6,4,7,8,9,10};
		Integer[] numbers = {4,4,6,6,7,2,3,1,9,10,8,8,6,2,12,14};
		TreeSet<Integer> integerTree = new TreeSet<Integer>();
		
		for(Integer nuVal:numbers) {
			integerTree.add(nuVal);			
		}
		
		System.out.println("Sorted Array: "+integerTree);
		
		
		Integer missIncVal=1;
		TreeSet<Integer> missingIntegerTree = new TreeSet<Integer>();
		
		for(Integer missingVal:integerTree) {
			
			System.out.println("missIncVal: "+missIncVal);
			System.out.println("missingVal: "+missingVal);
			if(missIncVal!=missingVal) {
				missingIntegerTree.add(missIncVal);
			}
			missIncVal=missingVal+1;
		}
		System.out.println("Missing Value is : "+missingIntegerTree);
	}


	}


