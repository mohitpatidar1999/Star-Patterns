/*

*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter no. of rows ");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=(r+1)/2;
		for(int i=1;i<=r;i++){
		        for(int j=1;j<=c;j++){
		            if(i<=c){
		                if(j>=i && j<=c)
		                System.out.print("*");
		                else
		                System.out.print(" ");
		            }
		            else{
		                if(j>=r+1-i && j<=c)
		                System.out.print("*");
		                else
		                System.out.print(" ");
		            }
		        
		    }
		    System.out.println();
		}
		    
	}
}