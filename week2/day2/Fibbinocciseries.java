package week2.day2;

public class Fibbinocciseries 
{
	public static void main(String[] args) 
	{			
		// TODO Auto-generated method stub
		int firstNum=0,secNum=1,sum=0;
		int i=1;
	
		System.out.println(firstNum);
	
		for(i=1;i<=11;i++)
		{
			sum=firstNum+secNum;				
			firstNum=secNum;					
			secNum=sum;
		
			System.out.println(sum);		
			
		}	
	}

}

		