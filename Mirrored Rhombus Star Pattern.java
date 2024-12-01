/*

******
 ******
  ******
   ******
    ******
     ******
     
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter no. of rows to print mirrored rhombus with stars");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=r*2-1;
		for(int i=1;i<=r;i++){
		    for(int j=1;j<=r*2-1;j++){
		        if(j>=i&&j<=r+i-1)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
