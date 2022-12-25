package userinput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int num1,num2,addition,multiplication;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		addition=num1+num2;
		System.out.println("Addition of two numbers: " + addition);
		multiplication=num1*num2;
		System.out.println("Addition of two numbers: " + multiplication);

	}

}
