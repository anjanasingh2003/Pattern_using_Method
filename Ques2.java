/*
	12345
    12345
    12345
    12345
    12345
*/ 

import java.util.Scanner;
public class Ques2
{
   static void pattern(int n)
   {
    int i,j;
    for (i=1;i<=n;i++)
    {
        for (j=1;j<=n;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
   }
    
        
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of row :");
        int n= sc.nextInt();
        pattern(n);
        sc.close();
    }
}