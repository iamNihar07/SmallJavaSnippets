package Arrays.DDA;
import java.io.*;
public class SquareMatrix
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter the size of the matrix.");
        int m=Integer.parseInt(in.readLine());

        int a[][]=new int[m][m];
        System.out.println("Enter the elements of the Array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
            }
        }

        int s1[]=new int[m];
        int s2[]=new int[m];

        int sum1=0;
        for(int i=0;i<m;i++)
        {
            sum1=0;
            for(int j=0;j<m;j++)
            {
                sum1=sum1+a[i][j];
            }            
            s1[i]=sum1;
        }

        int sum2=0;
        for(int i=0;i<m;i++)
        {
            sum2=0;
            for(int j=0;j<m;j++)
            {
                sum2=sum2+a[j][i];
            }            
            s2[i]=sum2;
        }

        boolean flag1 =false, flag2=false;
        for(int i=0;i<m-1;i++)
        {            
            if(s1[i]!=s1[i+1])
            {
                flag1=true;
                break;
            }
        }

        for(int i=0;i<m-1;i++)
        {            
            if(s2[i]!=s2[i+1])
            {
                flag2=true;
                break;
            }
        }

        for(int i=0;i<m;i++)
        {
            System.out.println("Sum of "+i+" row= "+s1[i]);
        }

        for(int i=0;i<m;i++)
        {
            System.out.println("Sum of "+i+" row= "+s2[i]);
        }

        if(flag1==false && flag2==false)
        {
            System.out.println("Square Matrix.");
        }
        else
        {
            System.out.println("Not a sq matrix.");
        }
    }
}
