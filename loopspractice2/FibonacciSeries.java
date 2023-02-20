package loopspractice2;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c,n,i;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.print(a+","+b+",");
		for(i=0;i<n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(c+",");
			
			
		}
	}

}
