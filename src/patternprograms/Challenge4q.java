package patternprograms;

import java.util.Scanner;

public class Challenge4q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a row");
		int r=sc.nextInt();
		System.out.print("Enter a column");
		int c=sc.nextInt();
		for(int i=1;i<=r;i++)
		{  
			for(int j=1;j<=c;j++)
			{   
				if((i+j)%2==0)
				{
					System.out.print("1"+" ");
				}
				else
				{
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}
		

	}

}
