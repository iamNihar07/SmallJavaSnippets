package Class_Progs;

import java.io.*;
public class prime
{
    int x;
    void accept()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a no.");
        x=Integer.parseInt(in.readLine());
    }
    void isprime()
    {
        boolean flag=true;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                flag=false;
            }
        }
        if(flag==true)
        {
            System.out.println(x+" is prime.");
        }
        else
        {
            System.out.println(x+" is not prime.");
        }
    }
    static void main() throws IOException
    {
        prime ob=new prime();
        ob.accept();
        ob.isprime();
    }
}


    