package Arrays.DDA;
import java.io.*;
public class Mirror
{
    static void main()throws IOException
    {
        int a[][]={{1,2,3},{5,6,7},{7,8,9}};
        int m=3;
        
        int b[][]=new int[m][m];    
        int k=m-1;
        for(int i=0;i<m;i++)
        {            
            for(int j=0;j<m;j++)
            {
                b[j][i]=a[j][k];                
            }
            k--;
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}