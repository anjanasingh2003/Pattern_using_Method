/*
     54321
      4321
       321
        21
         1 
 */
 import java.util.Scanner;
 public class Ques22
 {
    static void pattern(int n)
    {
        for(int i=1; i<=n; i++)
         {     
             int num = n-i+1;
             for(int j=1; j<=i; j++)
             {
                 System.out.print(" ");
             } 
 
             for(int k=1; k<=(n-i+1); k++)
             {
                 System.out.print(num);
                 num--;
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
 


 
