package patternprograms;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("-");
			}
			for(int k=0;k<n-i;k++)
			{
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
