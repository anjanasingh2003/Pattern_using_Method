/*
54321
4321
321
21
1

 */

import java.util.Scanner;
public class Ques12
{
    static void pattern (int n)
    {
        for(int i=n; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
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