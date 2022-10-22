package demo;

import java.util.Scanner;

public class Calculator {
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of a:");
		double a=sc.nextDouble();
		System.out.println("enter the value of b:");
		double b=sc.nextDouble();
		System.out.println("Enter the operation:\nFor Addtion is '+'\nFor Subraction is '-'\nFor multiplication is '*'\nFor Division is '/'");
		char operation=sc.next().charAt(0);
		if(operation=='+'||operation=='-'||operation=='*'||operation=='/')
		{
			switch(operation) {
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			}
		}
		else
			System.out.println("wrong input");
	}
}
