package Arrays;

import java.io.*;
/**
 * prime nos of array
 */
public class Prime
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);        
        boolean flag=false;
        int a[]=new int[10];        
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the element at "+(i)+" position");
            a[i]=Integer.parseInt(in.readLine());
        }

        for(int i=0;i<a.length;i++)
        {
            flag=false;
            if(a[i]>1)
            {
                for(int j=2;j<a[i];j++)
                {
                    if(a[i]%j==0)
                    {
                        flag=true;
                        break;
                    }
                }
                if(flag==false)
                {
                    System.out.println("Prime no.");
                    System.out.println(a[i]+" is prime.");
                }   
            }

        }
    }
}