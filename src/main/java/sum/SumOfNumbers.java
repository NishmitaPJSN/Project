package sum;

import java.util.Scanner;

public class SumOfNumbers
{

	public static void main(String[] args)
	{
		String choice = "";

		int sum = 0;
		
		//int count = 0;
		Scanner sc = new Scanner(System.in);

		while(!choice.equals("0"))
		{
		    System.out.println("Enter a number or 0 to terminate the program");
		    choice = sc.next();

		    if(!choice.equals("0"))
		    {
		        int number = Integer.parseInt(choice);
		        sum = sum+number;
		    
		        //count++;
		    }
		} 

		System.out.println("Sum of the numbers is: "+sum);
		
		
	}
}
	


