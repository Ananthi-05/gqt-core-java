package patternprograms;

import java.util.Scanner;

public class Challenge7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
            for (int s=1;s<=n-i;s++) 
            {
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            for (int k=i-1;k>=1;k--) {
                System.out.print(k + " ");
            }
            System.out.println();
		}


	}

}
