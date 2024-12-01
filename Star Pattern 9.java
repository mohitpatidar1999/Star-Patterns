/*

ABCDEDCBA
ABCD DCBA
ABC   CBA
AB     BA
A       A

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter how many rows you want to print");
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		if(r<=26){
		int c=r*2-1;
		char k;
		for(int i=1;i<=r;i++){
		    k='A';
		    for(int j=1;j<=c;j++){
		        if(j<=r+1-i || j>=r-1+i){
		            System.out.print(k);
		            if(j<r) k++;
		            else k--;
		        }
		        else{
		            System.out.print(" ");
		            if(j==r) k--;
		        }
		    }
		    System.out.println();
		}
		System.out.println("");
	}
	else
	System.out.println("Enter number between 1 and 26");
	}
}
