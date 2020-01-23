package Functions;

import java.io.*;

public class Function_02 //checking for a prime number
{
    static int isprime(int x) 
    {
        int k=0;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                k++;
            }
        }
        if(k==0)
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
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a number");
        int y=Integer.parseInt(in.readLine()); 
        int m=isprime(y); 
        if(m==1)
        {
            System.out.println("Prime.");
        }
        else
        {
            System.out.println("Composite.");
        }
    }            
}

