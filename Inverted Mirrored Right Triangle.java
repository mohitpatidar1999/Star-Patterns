/*

*****
 ****
  ***
   **
    *

*/

/*  SOLUTION 1 */

public class Main
{
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
		    for(int j=0;j<i;j++)
		        System.out.print(" ");
		    for(int k=5-1-i;k>=0;k--)
		        System.out.print("*");
		        
		    System.out.println();
		}
	}
}

/* SOLUTION 2 */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter how many rows you want to print");
	    int rows=sc.nextInt();
	    int columns = rows;
		for(int i=1;i<=rows;i++){
		    for(int j=1;j<=columns;j++){
		        if(j>=i && j<=rows)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
