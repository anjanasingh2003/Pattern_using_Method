/*
 
    1
   12
  123
 1234
12345
 1234
  123
   12
    1

 */
import java.util.Scanner;
 public class Ques40
 {
    static void pattern(int n)
    {
        for (int i=1;i<n;i++)
		{ 
			for (int j=1;j<=(n-i+1);j++)
			{    
				System.out.print(" ");
			}
            for(int k=1; k<=i; k++)
            {
                System.out.print(k);
            }
			System.out.println();
		}
		for (int i=1;i<=n;i++)
		{    
			for (int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
            for(int k=1; k<=n-i+1; k++)
            {
                System.out.print(k);
            }
			
			System.out.println();
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