
import java.io.*;
public  class Buzz_or_HCF
{
    public static void main() throws IOException //to find whether its a buzz no. or then HCF
    {  
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int a,b=0;
        System.out.println("1.BUZZ No.");
        System.out.println("2.HCF.");           
        int ch=Integer.parseInt(in.readLine());  
        switch (ch)
        {   case 1:
            System.out.println("ENTER THE NO.");
            a=Integer.parseInt(in.readLine()); 
            if(a%10==7 || a%7==0)
            { System.out.println("Buzz no."); 
            }
            else
            { System.out.println("Not a Buzz no."); 
            }
            break;
            case 2:
            int i;
            int h=0;
            System.out.println("ENTER THE First NO.");
            a=Integer.parseInt(in.readLine()); 
            System.out.println("ENTER THE Second NO.");
            b=Integer.parseInt(in.readLine()); 
            double z=Math.max(a,b);
            for(i=1;i<z;i++)
            { if(a%i==0 && b%i==0)
                {  h = i;}
            }
            System.out.println("HCF of " +a+" & " +b+" = "+h);
            break;
        }
    }
}
