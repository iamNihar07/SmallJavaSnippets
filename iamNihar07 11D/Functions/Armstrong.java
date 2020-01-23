package Functions;

import java.io.*;
/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Armstrong
{
    int Armstrong(int n)
    {
        int m=n;
        int a=0,s=0;
        while(m!=0)
        {
            a=m%10;
            s=s+(a*a*a);
            m=m/10;
        }

        if(s==n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    static void main()throws IOException
    {
        Armstrong ob=new Armstrong();
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        System.out.println("Enter a number.");
        int x=Integer.parseInt(in.readLine());
        int r=ob.Armstrong(x);
        if(r==1)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}