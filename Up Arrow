/*

*********
**** ****
***   ***
**     **
*       *

*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows you want to print");
		int rows = sc.nextInt();
		int columns = rows*2-1;
		for(int i=1;i<=rows;i++){
		    for(int j=1;j<=columns;j++){
		        if(j>=1&&j<=rows+1-i || j>=rows-1+i&&j<=columns)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
