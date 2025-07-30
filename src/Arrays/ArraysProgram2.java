/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
class ArrayOperations{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	void createArray()
	{
		System.out.println("Enter the count:");
		int cls=sc.nextInt();
		System.out.println("Enter the student count in each class:");
		int stu=sc.nextInt();
		arr=new String[cls][stu];
		System.out.println("Array created");
		System.out.println("............................");
	}
	void collectdata()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside a class:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter the name of the student no:"+(j+1));
				arr[i][j]=sc.next();
			}
		}System.out.println("data collected");
		System.out.println("-------------------------");
		
	}
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside a class:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(" the name of the student no:"+(j+1)+"is "+arr[i][j]);
			
			}
		}
		System.out.println("data displayed");
		System.out.println("-------------------------");
	}
}
public class ArraysProgram2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations a1=new ArrayOperations();
		a1.createArray();
		a1.collectdata();
		a1.display();

	}

}
