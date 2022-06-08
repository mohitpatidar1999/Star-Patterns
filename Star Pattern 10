/* FOR ODD ROWS

   *
  ***
 *****
*******
 *****
  ***
   *
   
*/

import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    System.out.println("Enter rows");
	    Scanner sc = new Scanner(System.in);
	    int r=sc.nextInt();
	    int c=r;
	    int k=0;
	    for(int i=1;i<=r;i++){
	        if(i<=(r+1)/2) k++;
	        else k--;
	        for(int j=1;j<=c;j++){
	            if(j>=((r+1)/2-k+1) && j<=((r+1)/2+k-1)){
	            System.out.print("*");
	            
	            }
	            else{
	            System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
		
	}
}


/* FOR EVEN ROWS

   *
  ***
 *****
*******
*******
 *****
  ***
   *
   
*/


import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    System.out.println("Enter rows");
	    Scanner sc = new Scanner(System.in);
	    int r=sc.nextInt();
	    int c=r;
	    int k=0;
	    for(int i=1;i<=r;i++){
          if(r%2==0){
            if(i<=(r+1)/2) k++;
            if(i>((r+1)/2)+1) k--;
          }
          else
    	      if(i<=(r+1)/2) k++;
	            else k--;
	       for(int j=1;j<=c;j++){
	            if(j>=((r+1)/2-k+1) && j<=((r+1)/2+k-1)){
	            System.out.print("*");
	            
	            }
	            else{
	            System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
		
	}
}
