package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] chArr=test.toCharArray();
		
		for(int i=0;i<chArr.length;i++) {
			//System.out.println(i%2);
			if(i%2!=0) {
				chArr[i]=Character.toUpperCase(chArr[i]);
				}
			System.out.print(chArr[i]);
	}
		
		

	}

}
