package loopspractice2;

import java.util.Scanner;

public class Multiplicationtable {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n;
		int mul;
		System.out.println("Enter the value of n to displat that multiplication table");
		n=sc.nextInt();
		for(i=1;i<=10;i++)
		{
			mul=n*i;
			System.out.println(n+" X "+i+"="+mul);
			
		}
		
	}

}
