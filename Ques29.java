/*
 123456789
  1234567
   12345
    123
     1

 */

 import java.util.Scanner;
 public class Ques29
 {
    static void pattern(int n)
      {
        for(int i=1; i<=n; i++)
        {  
           for(int j=1; j<i; j++)
           {
               System.out.print(" ");
           }

           for(int k=1; k<=(2*(n-i)+1); k++)
           {
               System.out.print(k);
               
           } 
           
            System.out.println( );
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