/*

      *******
     *******
    *******
   *******
  *******
 *******
*******

*/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter no. of rows to print rhombus with stars");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=r*2-1;
		for(int i=1;i<=r;i++){
		    for(int j=1;j<=r*2-1;j++){
		        if(j>=r+1-i&&j<=r*2-i)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
