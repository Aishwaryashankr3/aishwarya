package demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class TotalCountOfNumberInTheDictionary {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size for input values");
		int size =sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		LinkedHashMap<Integer,Integer>lhm=new LinkedHashMap<Integer,Integer>();
		for(int i=1;i<=9;i++)
		{
			int count=0;
			for(int fetch:arr)
			{
				if(fetch%i==0)
					count++;
			}
			lhm.put(i,count);
		}
		System.out.print("Output: ");
		System.out.print(lhm);
	}
}
