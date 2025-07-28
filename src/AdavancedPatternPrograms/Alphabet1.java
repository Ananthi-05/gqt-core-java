/**
 * 
 */
package AdavancedPatternPrograms;

import java.util.Scanner;
/*
***********
*         *
*         *
*         *
*         *
***********
*         *
*         *
*         *
*         *
*         *
 */

/**
 * @author Ananthi
 * @category Patterns
 * @description This is a example for conditional Patterns
 * 
 * 
 */
public class Alphabet1 {

	/**
	 * @param args
	 * @description This program explains the logic of Pattern A
	 */
	//i==0||j==(n-1)||j==0||i==n/2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				if(i==0||j==(n-1)||j==0||i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
