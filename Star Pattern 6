/*

    *
   * *
  * * *
 * * * *
* * * * *

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter how many rows you want to print");
	    int rows=sc.nextInt();
	    int columns = 2*rows - 1;
	    boolean k=true;
		for(int i=1;i<=rows;i++){
		    k=true;
		    for(int j=1;j<=columns;j++){
		        if(j>=rows+1-i && j<=rows-1+i && k){
		            System.out.print("*");
		            k=false;
		        }
		        else{
		            System.out.print(" ");
		            k=true;
		        }
		    }
		    System.out.println();
		}
	}
}
