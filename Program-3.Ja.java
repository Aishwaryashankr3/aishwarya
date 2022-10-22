package demo;

import java.util.Scanner;

public class SeriesOfNumber_Problem3 {
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter single integer as input");
		int a=sc.nextInt();
		if(a%2==0)
			a=a-1;
		int arr[]=new int[a],index=0,initial=1;
		
		for(int i=0;i<a;i++)
		{
			arr[index++]=initial;
			initial=initial+2;
		}
		System.out.print("Output: ");
		for(int fetchElement:arr)
			System.out.print(fetchElement+" ");
	}
}
