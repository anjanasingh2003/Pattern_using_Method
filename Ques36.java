/*
 
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *


 */

 import java.util.Scanner;
 public class Ques36
 {
    static void pattern(int n)
    {
        for (int i=1;i<n;i++)
            {
                for (int j=1;j<(n-i+1);j++)
                {
                    System.out.print(" ");
                }
                for (int k=1;k<=i;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i=1;i<=n;i++)
            {
                for (int j=1;j<i;j++)
                {
                    System.out.print(" ");
                }
                for (int k=1;k<=(n-i+1);k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            } 
    
    }
     public static void main(String[] args) 
     {    
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

           pattern(n);
            sc.close();
    }
 }