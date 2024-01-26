/*
        5
       54
      543
     5432
    54321
 
 */

 import java.util.Scanner;
public class Ques17
{
    static void  pattern(int n)

    {
        for(int i=1; i<=n; i++)
        {   
            int num=i;
            for(int j=1; j<=(n+1-i); j++)
            {
                System.out.print(" ");
            } 

            for(int k=1; k<=i; k++)

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

