/*
        9
       987
      98765
     9876543
    987654321
 */
import java.util.Scanner;
 public class Ques25
 {
    static void pattern(int n)
    {
        for(int i=1; i<=n; i++)
        {    
               int num = 2*n-1;
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            } 

            for(int k=1; k<=2*i-1; k++)
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
 