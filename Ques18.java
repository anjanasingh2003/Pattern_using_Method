/*
       5
      45
     345
    2345
   12345


 */

 import java.util.Scanner;
public class Ques18
{
    static void  pattern(int n)
    {
        for(int i=1; i<=n; i++)
        {   
            int num = n-i+1;
            for(int j=1; j<=(n-i+1); j++)
            {
                System.out.print(" ");
            } 

            for(int k=1; k<=i; k++)
            {
                System.out.print(num);
                num++;
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
