package patternprograms;

import java.util.Scanner;

public class Challenge9q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}

	}

}
