import java.io.*;
public class Twisted_prime 
{ public static void main()throws IOException //twisted primes nos.
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a=0;
        int x=a;
        int nn=0;
        int r=0;
        System.out.println("Enter a Number");
        x=Integer.parseInt(in.readLine());
        int i;
        boolean flaga=true;
        boolean flagb=true;
        for(i=2;i<x;i++)
            { if(x%i==0)
                { flaga=false;
                    break; 
                }
            }
        while(nn!=0)
        {
            x=r%10;
            nn=nn*10+x;
            x=x/10;
        }
        for(i=2;i<nn;i++)
        { if(x%i==0)
            {flagb=false;
                break;
            }
        }
        if(flaga==true && flagb==true)
        {System.out.println(x+" is a Twisted Prime no. ");}
         else
         {System.out.println(x+" isn't a Twisted Prime no. ");}
        }
    }