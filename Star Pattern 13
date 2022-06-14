/*

   1
  232
 34543
4567654

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter rows");
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c=r*2-1;
		int k=0;
		for(int i=1;i<=r;i++){
		    k=i;
		    for(int j=1;j<=c;j++){
		        
		        if(j>=r+1-i&&j<=r-1+i){
		            
		            System.out.print(k);
		            if(j>=r) k--;
		            else k++;
		        }
		        else
		            System.out.print(" ");
		    
		        
		    }
		    System.out.println();
		}
	}
}
