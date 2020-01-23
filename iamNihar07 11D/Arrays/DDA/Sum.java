package Arrays.DDA;
import java.io.*;
/**
 * 
 */
public class Sum
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int a[][]=new int[3][4];

        System.out.println("Enter the elements row wise");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
            }
        }
        
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum=sum+a[i][j];
            }            
        }
        System.out.println("Sum ="+sum);
    }
}