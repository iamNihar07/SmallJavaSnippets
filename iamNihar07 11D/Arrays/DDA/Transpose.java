package Arrays.DDA;
import java.io.*;
/**
 * 
 */
public class Transpose
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
        
        int b[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {           
            for(int j=0;j<4;j++)
            {
                b[i][j]=a[j][i];
            }         
        }
        
        for(int i=0;i<4;i++)
        {           
            for(int j=0;j<4;j++)
            {
                System.out.print(b[i][j]+" ");
           }      
           System.out.println();
        }  
    }
}