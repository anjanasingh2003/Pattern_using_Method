/*

*
**
***
****
*****

 */

 import java.util.Scanner;
public class Ques4
{
    static void pattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) 
    {    
           Scanner sc=new Scanner(System.in);
           System.out.println("enter number of star:");
           int n=sc.nextInt();
          pattern(n);//calling
        sc.close();
        
    }
}

