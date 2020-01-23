package Arrays.DDA;
import java.io.*;
/**
 * 
 */
public class Diagonals
{
    static void LD()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int a[][]=new int[4][4];

        System.out.println("Enter the elements row wise");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());    
            }
        }
        
        int s=0;
        for(int i=0;i<4;i++)
        {
            s=s+a[i][i];
        }
        System.out.println("Sum of LD "+s);
    }
    
    static void RD()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int a[][]=new int[4][4];

        System.out.println("Enter the elements row wise");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());    
            }
        }
        
        int s=0;
        for(int i=0;i<4;i++)
        {
            s=s+a[i][3-i];
        }
        System.out.println("Sum of RD "+s);
    }
}