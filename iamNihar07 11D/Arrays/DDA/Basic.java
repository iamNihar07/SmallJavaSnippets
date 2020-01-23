package Arrays.DDA;
import java.io.*;
/**
 * 
 */
public class Basic
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

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}