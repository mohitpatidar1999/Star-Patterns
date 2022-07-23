/*

*********
**     **
* *   * *
*  * *  *
*   *   *
*  * *  *
* *   * *
**     **
*********

*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter no. of rows to print a hollow square with diagonal with stars");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
		    for(int j=1;j<=r;j++){
		        if(i==1||i==r){
		            if(j>=1&&j<=r){
		                System.out.print("*");
		            }
		            else 
		            System.out.print(" ");
		        }
		        else{
		            if(j<=(r+1)/2){
		                if(j==1||j==i||j==r+1-i||j==r)
		                System.out.print("*");
		                else
		                System.out.print(" ");
		            }
		            else{
		                if(j==1||j==i||j==r||j==r+1-i)
		                System.out.print("*");
		                else
		                System.out.print(" ");
		            }
		        }
		        
		    }
		    System.out.println();
		}
	}
}
