package loopspractice2;

import java.util.Scanner;

public class Displaydigitsinthegivenumber {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n,r;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			n=n/10;
			System.out.println(r);
			
		}
	}

}
