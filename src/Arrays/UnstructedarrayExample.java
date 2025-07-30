/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
public class UnstructedarrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the student count:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{  
			System.out.print("Enter the marks of student no:"+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("------------------------");
		for(int i=0;i<arr.length;i++)
		{  
			System.out.println("the marks of student no:"+(i+1)+" is "+arr[i]);
			
		}

	}

}
