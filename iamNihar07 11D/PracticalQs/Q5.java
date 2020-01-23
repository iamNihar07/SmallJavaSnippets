package PracticalQs;

import java.io.*;
public class Q5
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int m,n;
        int a=0,s=0;
        while(true)
        {
            System.out.println("Enter m from 100 & 1000");
            m=Integer.parseInt(in.readLine());
            if(m>=100 && m<1000)
            {
                break;
            }
            else
            {
                System.out.println("\u000c");
                System.out.println("Follow the restrictions");
                
            }
        }
        while(true)
        {
            System.out.println("Enter n less than 100");
            n=Integer.parseInt(in.readLine());
            if(n<100)
            {
                break;
            }
            else
            {
                System.out.println("\u000c");
                System.out.println("Follow the restrictions");
                
            }
        }

        for(int i=m;;i++)
        {
            int j=i;
            a=0;
            s=0;
            while(j!=0)
            {
                a=j%10;
                s=s+a;
                j=j/10;
            }
            if(s==n)
            {
                System.out.println(i);
                break;
            }
        }
    }
}

           