package Functions;

import java.io.*;

public class Function_07 //?
{
    static boolean isprime(int x) 
    {
        boolean flag=false;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static void main()throws IOException 
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter first number");
        int n=Integer.parseInt(in.readLine()); 
        boolean flaga=isprime(n); 
        System.out.println("Enter second number");
        int m=Integer.parseInt(in.readLine()); 
        boolean flagb=isprime(m); 
        if(flaga==true&&flagb==true&&(n-m==2||m-n==2))
        {
            System.out.println("Twin Prime.");
        }
        else
        {
            System.out.println("Not Twin Prime.");
        }
    }            
}

