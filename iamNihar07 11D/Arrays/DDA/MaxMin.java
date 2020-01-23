package Arrays.DDA;
import java.io.*;
/**
 * 
 */
public class MaxMin
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

        int max=a[0][0],min=a[0][0];
        for(int i=0;i<4;i++)
        {            
            for(int j=0;j<4;j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
                if(a[i][j]<min)
                {
                    min=a[i][j];
                }                
            }        
        }      
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}