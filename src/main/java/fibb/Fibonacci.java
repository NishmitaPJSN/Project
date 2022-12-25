package fibb;

import java.util.Scanner;

public class Fibonacci {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int fib1=0, fib2=1,temp,n;	 
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 n= sc.nextInt();
		 System.out.print("Fibonacci series are:");
		 
		 for(int i=1;i<=n;i++)
		 {
			System.out.print("   "+fib1);
			temp=fib1+fib2;
			fib1=fib2;
			fib2=temp;
			 
		 }
		 
	}
}
