package loopspractice2;

import java.util.Scanner;

public class Numberofdigitsingivennumber {
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int r,n,count=0,temp;
		System.out.println("Enter the value of n");
		n=s.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			count=count+1;
		}
		n=temp;
		System.out.println("Number of digits in "+n+"  "+count);
		
	}

}
