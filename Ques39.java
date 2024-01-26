/*

5
45
345
2345
12345
2345
345
45
5

 */
import java.util.Scanner;
 public class Ques39
 {
	static void pattern(int n)
    {
        for (int i=1;i<n;i++)
		{    int num = n-i+1; 
			for (int j=1;j<=i;j++)
			{    
				System.out.print(num);
                num++;
			}
			System.out.println();
		}
		for (int i=1;i<=n;i++)
		{     int num = i;
			for (int j=1;j<=(n-i+1);j++)
			{
				System.out.print(num);
                num++;
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