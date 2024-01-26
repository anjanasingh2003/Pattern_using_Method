/*  	*****
        *****
        *****
        *****
        *****
 */  

 import java.util.Scanner;

 public class Ques1 {
     
     static void pattern(int row)
     {
         int i,j;
         for (i=1;i<=row;i++)
         {
             for (j=1;j<=row;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter the number of row :");
         int row = sc.nextInt();
         pattern(row);
         sc.close();
     }
 
 }
 
