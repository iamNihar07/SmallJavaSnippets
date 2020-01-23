import java.io.*;
public class Prime_Test
{ 
    void main ()throws IOException //prime test
    {   InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter the no.");
        int x=Integer.parseInt(in.readLine());
        x=0;
        int i;
        boolean flag=true;
        for(i=2;i<x;i++)
        { if(x%i==0)
            { flag=false;
                break; 
            }
        }
        if(flag==true)
        { 
            System.out.println("PRIME no.");}
            else
            {System.out.println("NOT PRIMES no."); 
        }
    }
}