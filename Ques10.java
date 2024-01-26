/*
12345
1234
123
12
1

 */

import java.util.Scanner;
public class Ques10
{
    
    static void pattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=(n+1-i); j++)
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
