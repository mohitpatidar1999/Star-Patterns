/*

This pattern will appear in output.
*
**
***
****
*****

*/

/* SOLUTION 1 in C*/

#include<stdio.h>
#include<conio.h>
void main(){
 clrscr();
 for(int i=0;i<5;i++){
  for(int j=0;j<=i;j++){
   printf("*");
  }
  printf("\n");
 }
getch();
}


/* SOLUTION 2 in C*/

#include<stdio.h>
#include<conio.h>
void main(){
 clrscr();
 for(int i=0;i<5;i++){
  for(int j=0;j<5;j++){
   if(j<=i)
    printf("*");
   else
    printf(" ");
  }
  printf("\n");
 }
getch();
}

/* SOLUTION 3 in JAVA */

public class Main
{
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
            		for(int j=0;j<=i;j++){
                		System.out.print("*");
            		}
            	System.out.println("");
        	}
	}
}
