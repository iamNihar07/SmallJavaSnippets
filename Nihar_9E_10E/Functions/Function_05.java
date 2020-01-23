package Functions;

import java.io.*;

public class Function_05 //?
{
    static int sumofdigits(int x)
    {
        int t=x;
        int d=0;
        int sum=0;
        while(t!=0)
        {
            d=t%10;
            sum=sum+(d*d*d);
            t=t/10;
        }
        return sum;
    }
          
       

    static void main()throws IOException 
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a number");
        int n=Integer.parseInt(in.readLine()); 
        int arm=sumofdigits(n); 
        if(arm==n)
        {
            System.out.println("Armstrong.");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }            
}


    