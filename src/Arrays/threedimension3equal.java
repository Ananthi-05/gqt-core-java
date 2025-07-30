package Arrays;
import java.util.Scanner;
class threedimension
{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	void createarray()
	{
		System.out.println("Enter school count:");
		int sch=sc.nextInt();
		System.out.println("Enter class count in each school:");
		int cls=sc.nextInt();
		System.out.println("Enter the student count in each school:");
		int stu=sc.nextInt();
		
		arr=new String[sch][cls][stu];
		 System.out.println("Array created");
		}
	
	void collectdata()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Inside school no:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{  System.out.println("Inside class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
				System.out.println("enter the name of the student no:"+(j+1));
				arr[i][j][k]=sc.next();
			}
		}
		}
		System.out.println("data collected");
		System.out.println("-------------------------");
		
	}
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{   System.out.println("Inside school no:"+(i+1));
			
			for(int j=0;j<arr[i].length;j++)
			{   System.out.println("Inside a class no:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
				System.out.println(" the name of the student no:"+(j+1)+"is "+arr[i][j][k]);
			
			}
		}
		}
		System.out.println("data displayed");
		System.out.println("-------------------------");
	}
}
public class threedimension3equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threedimension j3=new threedimension();
		j3.createarray();
		j3.collectdata();
		j3.display();
		

	}

}


