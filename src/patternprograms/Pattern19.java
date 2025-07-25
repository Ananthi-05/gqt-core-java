package patternprograms;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		int c;
		for(int i=n;i>=1;i--)
		{  c=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c++;
			}
			c++;
			System.out.println();
				
		}

	}

}
