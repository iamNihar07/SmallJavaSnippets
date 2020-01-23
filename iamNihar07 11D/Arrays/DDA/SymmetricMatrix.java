package Arrays.DDA;
import java.io.*;
/**
 * 
 */
public class SymmetricMatrix
{
    static void main()throws IOException
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

        boolean flag=true;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    flag=false;
                    break;
                }
            }
        }

        if(flag==true)
        {
            System.out.println("Symmetric Matrix");
        }
        else
        {
            System.out.println("Asymmetric Matrix");
        }
    }
}
