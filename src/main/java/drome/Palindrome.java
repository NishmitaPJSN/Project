package drome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int  reverse=0,r;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=n.nextInt(); 
		int temp=num;
		
		
		//num=num/10;
		while(num !=0)
		{
			r=num%10;
			reverse=reverse*10+r;
			num=num/10;
			
		}
		if(temp==reverse)
		{
			System.out.println("Given number "+temp+" is a Palindrome" );
		}
		else
		{
			System.out.println("Given number "+temp+" not a Palindrome");
		}
		
		
		

	}

}

//Logic part
// example num=121 
//temp=num so now temp=121
//121 should not be equal to 0 or must be greater than zero
//
