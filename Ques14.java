/*
     *  
    **
   ***
  ****
 *****

 */

import java.util.Scanner;
public class Ques14
{
    static void pattern (int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=(6-i); j++)
            {
                System.out.print("  ");
            } 

            for(int k=1; k<=i; k++)
            {
                System.out.print("* ");
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
