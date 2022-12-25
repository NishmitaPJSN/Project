package multiples;

//import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) 
	
	{
		int sumOf=0 ,x=100;
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a Number");
		//int x=sc.nextInt();
		
		for( x=1;x<100;x++)
		{
			if(x % 3==0 || x% 5==0)
			{
				sumOf+=x;
			}
		}
	//	for( x=1;x<10;x++)
		//{
			//if(x % 5==0)
			//{
				//sumOf5+=x;
			//}
	//for ( x=1; x<10; x++)
		{
			//if(x %3 ==0 && x%5==0)
				//repeat+=x;
		}
		
		
			
			System.out.println("Sum of all Multiples of 3 or 5 less than 100 are:" +sumOf);
		
		// TODO Auto-generated method stub

	}

}
