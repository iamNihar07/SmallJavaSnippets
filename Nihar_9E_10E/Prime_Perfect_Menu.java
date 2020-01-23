
import java.io.*;
public  class Prime_Perfect_Menu
{
    public static void main() throws IOException //tests for prime or perfect nos.
    {  
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int a,b=0;
        System.out.println("1.PRIME TEST");
        System.out.println("2.PERFECT NO. TEST");           
        int ch=Integer.parseInt(in.readLine());
        System.out.println("ENTER THE NO.");
        a=Integer.parseInt(in.readLine());     
        boolean flag=true;
        int i;
        int x=0;
        int s=0;
        
        switch (ch)
        { case 1:
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
          break;
          case 2:
          for(i=1;i<x;i++)
            { s=s+i; 
            }
          if(s==x)
            { System.out.println("Perfect no.");}
          else
            { System.out.println("Not perfect no.");}
          break;
        }
    }
}


            