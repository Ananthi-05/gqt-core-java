package patternprograms;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print("*");
            }
            for (int k=0;k<i+1;k++) {
                System.out.print("#");
            }
            System.out.println();
        }

	}
}

