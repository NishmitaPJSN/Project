package year;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int year = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year");
		year=sc.nextInt();
		
		if(((year%4==0)&& (year % 100!=0))||(year%400==0))
		{
			System.out.println("Entered year is a Leap Year");
			
		}
		else
		{
			System.out.println("Entered year is not  a Leap Year");
		}
	}

}
