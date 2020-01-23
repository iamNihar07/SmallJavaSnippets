package Functions;

import java.io.*;
public class Function_09
{
    String isspecial(int x)
    {
        int m=x;

        int d=0,a=0,sum=0,pro=1;
        if(x>9 && x<100)
        {
            while(m!=0)
            {a=m%10;
                sum=sum+a;
                pro=pro*a;
                m=m/10;
            }

            if((sum+pro)==x)
            {
                return("Special 2 digit number.");
            }
            else
            {
                return("Not a Special 2 digit number.");
            }

        }
        else
        { 
            return("Not a Special 2 digit number.");
        }
    }

    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Function_09 ob = new Function_09();
        System.out.println("Enter a number.");
        int z=Integer.parseInt(in.readLine());
        String s= ob.isspecial(z);
        System.out.println(s);
    }
}

