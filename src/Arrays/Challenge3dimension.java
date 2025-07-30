/**
 * 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author Ananthi
 * @category Arrays
 * @description Example of 3 dimensional arrays
 */


class Revenue {
    int[][][] arr;
    String[] languageNames;
    Scanner sc = new Scanner(System.in);
    int movie, cat, lang,investment,prevyrprofit;
    void createarray() {
        System.out.println("Enter movie count:");
        movie = sc.nextInt();

        System.out.println("Enter categories of movie:");
        cat = sc.nextInt();

        System.out.println("Enter the number of languages:");
        lang = sc.nextInt();
        arr = new int[movie][cat][lang];
        languageNames = new String[lang];
         sc.nextLine(); 
        for (int i=0;i<lang;i++){
            System.out.print("Enter name of language "+(i+1)+":");
            languageNames[i] = sc.nextLine();
        }
        System.out.print(" enter Total Investment:");
        investment=sc.nextInt();
        System.out.print(" Enter the privous year profit");
        prevyrprofit=sc.nextInt();

        System.out.println("Array created");
    }

    void collectdata() {
        for (int i=0;i<movie;i++) {
            System.out.println("Inside Movie No: "+(i+1));
            for (int j=0;j<cat;j++){
                System.out.println("Inside Category No:"+(j+1));
                for (int k=0;k<lang;k++) {
                    System.out.print("Enter revenue for Language ("+languageNames[k]+"):₹");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Data collected");
        System.out.println("-------------------------");
    }

    void display() {
        int total=0;
        for (int i=0;i<movie;i++) {
            System.out.println("Inside Movie No: "+(i+1));
            for (int j=0; j<cat;j++) {
                System.out.println("  Category No: "+(j+1));
                for (int k=0;k<lang;k++) {
                    System.out.println("   "+languageNames[k]+"Revenue:₹"+arr[i][j][k]);
                    total+=arr[i][j][k];
                }
            }
        }
        System.out.println("-------------------------");
        System.out.println("Total Revenue: ₹" +total+"crores");
        System.out.println("Total Investment:₹"+investment+"crores");

        int profit=total-investment;
        if (profit>0) {
            System.out.println("Profit: ₹" + profit + " crores");
        } else if (profit<0) {
            System.out.println("Loss: ₹" + (-profit) + " crores");
        } else {
            System.out.println("No Profit No Loss");
        }
        if (profit>prevyrprofit) {
            System.out.println("Better than Previous year ₹"+(profit-prevyrprofit));
        } else if (profit<prevyrprofit) {
            System.out.println("Worst than last year by ₹" +(prevyrprofit-profit));
        } else {
            System.out.println("Same as last year profit");
        }

        System.out.println("Data displayed");
        System.out.println("-------------------------");
    }
}

public class Challenge3dimension {

	/**
	 * @param args
	 * @description example of Jagged arrays
	 */
		    public static void main(String[] args) {
		        Revenue r1 = new Revenue();
		        r1.createarray();
		        r1.collectdata();
		        r1.display();
		    }
		}



