/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * 
 */
 class Arrayscode {

	/**
	 * @param args
	 */
 
		// TODO Auto-generated method stub
		int arr[];
		Scanner sc=new Scanner(System.in);
		void createarray()
		{
			System.out.print("Enter the student count:");
			int n=sc.nextInt();
			 arr=new int[n];
			System.out.println("Array created");
			System.out.println("-----------------------------");
		}
		void collectdata()
		{
			for(int i=0;i<arr.length;i++)
			{  
				System.out.println("Enter the marks of student no: "+(i+1));
				arr[i]=sc.nextInt();
			}
			System.out.println("Data stored in the array");
		}
		void display()
		{
			for(int i=0;i<arr.length;i++)
			{  
				System.out.println(""
						+ "The marks of student no:"+(i+1)+" is "+arr[i]);
				
			}

		}
		public class Structuredarrayexample {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Arrayscode a1=new Arrayscode();
			a1.createarray();
			a1.collectdata();
			a1.display();

			
	}

}
}