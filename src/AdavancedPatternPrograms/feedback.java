/**
 * 
 */
package AdavancedPatternPrograms;

import java.util.Scanner;

/**
 * @author Ananthi
 * @category Patterns
 * @description This is a example for conditional Patterns 
 
 */
public class feedback {

	/**
	 * @param args
	 * @description To print the Feedback of the Global Quest Technology using Alphabets Patterns
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				if(i==0||j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) 
			{
				if(j==0||j==n-1||i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) 
			{
				if(i==0||j==0||i==(n-1)||i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) 
			{
				if(i==0||j==0||i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) 
			{
				if(j==0||i==0||j==n-1|i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) 
			{
				if((i==n-1&&j>0&&j<n-1)||(j==0&&i!=n-1)||(j==n-1&&i!=n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) 
			{
				if(j==0||i==0||i==n/2||(j==n-1&&i>0&&i<n/2)||((i-j+1)==n/2&&i>n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
				for(int j=0;j<n;j++) 
				{
					if(i==0||(j==0&&i<n/2)||i==n/2||(j==n-1&&i>n/2)||i==n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) 
				{
					if(i==0||j==0||i==(n-1)||i==n/2)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				for(int j=0;j<n;j++) 
				{
					if(i==0||(j==0&&i<n/2)||i==n/2||(j==n-1&&i>n/2)||i==n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("   ");
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
				System.out.print(" ");
				for(int j=0;j<n;j++) 
				{
					if(i==0||j==n/2)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("   ");
				for(int j=0;j<n;j++) 
				{
					if(i==0||j==0||i==n-1||(j==n-1&&i>=n/2)||(i==n/2&&j>=n/2))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print(" ");

				for(int j=0;j<n;j++) 
				{
					if((i==0&&j>0&&j<n-1)||(i==n-2&&j>0&&j<n-1)||
					  (j==0&&i>0&&i<n-2)||(j==n-1&&i>0&&i<n-2)||
					  (i==j&&i>=n/2))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) 
				{
					if(i==0||j==n/2)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("  ");
			
				
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
				System.out.print(" ");

				for(int j=0;j<n;j++) 
				{
					if(j==0||i==0||i==n/2||(j==n-1&&i>0&&i<n/2)||((i-j+1)==n/2&&i>n/2))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) 
				{
					if(i==0||j==0||i==(n-1)||i==n/2)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("   ");
				for(int j=0;j<n;j++) 
				{
					if(i==0||j==0||i==n-1||(j==n-1&&i>=n/2)||(i==n/2&&j>=n/2))
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				for(int j=0;j<n;j++) 
				{
					if(j==0||i==0||j==n-1|i==n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) 
				{
					if(j==0||i==0||j==n-1|i==n-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) 
				{
					if(i==0||j==(n-1)||i==n-1||j==n/4)
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
