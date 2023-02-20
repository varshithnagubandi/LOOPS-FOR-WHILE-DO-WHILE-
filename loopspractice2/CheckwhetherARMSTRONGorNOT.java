package loopspractice2;

import java.util.Scanner;

public class CheckwhetherARMSTRONGorNOT {
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		int n,r,cube,sum=0,temp;
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			
			cube=r*r*r;
			sum=sum+cube;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is an Armstrong number");
		}
		else
		{
			System.out.println(temp+" is not an Armstrong number");
		}
	}

}
