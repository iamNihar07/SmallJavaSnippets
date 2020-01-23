package Arrays.DDA;
import java.io.*;
/**
 * 
 */
public class SumOfRowColoumn
{
    static void row()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter n");
        int n=Integer.parseInt(in.readLine());
        int a[][]=new int[n][n];

        System.out.println("Enter the elements row wise");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());    
            }
        }

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=0;j<n;j++)
            {
                sum=sum+a[i][j];
            }            
            System.out.println("Sum of "+i+" row ="+sum);
        }

    }

    static void column()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter n");
        int n=Integer.parseInt(in.readLine());
        int a[][]=new int[n][n];

        System.out.println("Enter the elements row wise");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());    
            }
        }

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=0;j<n;j++)
            {
                sum=sum+a[j][i];
            }            
            System.out.println("Sum of "+i+" column ="+sum);
        }

    }
}