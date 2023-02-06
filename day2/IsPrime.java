package week2.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
boolean isPrime=true;
int input=89;

if(input==0 || input==1)
{
	System.out.println(input + " is not a Prime Number!");
}
else
{
		for(i=2;i<input;i++)
		{			
			if(input%i==0)
			{
				System.out.println(input + " is not a Prime Number!");
				isPrime=false;
				break;
			}		
						
		}
		if(isPrime)
		{
			System.out.println(input + " is a Prime Number!");
		}
			
	}
}

}
