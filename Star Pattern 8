/*

    1
   121
  12321
 1234321
123454321

*/





import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter how many rows you want to print");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = rows*2-1;
		for(int i=1;i<=rows;i++){
		    int k=1;
		    for(int j=1;j<=columns;j++){
		        if(j>=rows+1-i&&j<=rows-1+i){
		            System.out.print(k);
		            if(j<rows) k++;
		            else k--;
		        }
		        else
		            System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
}
