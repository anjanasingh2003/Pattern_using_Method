/*	
1
22
333
4444
55555

 */

import java.util.Scanner;
public class Ques5
{
    static void pattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) 
    {    
           Scanner sc=new Scanner(System.in);
           System.out.println("enter number of row:");
           int n=sc.nextInt();
         pattern(n); /*  function calling */
        sc.close();
        
    }
}

