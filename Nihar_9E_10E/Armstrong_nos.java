import java.io.*;
public class Armstrong_nos
{ 
    public static void main ()throws IOException //armstrong no.
    {   InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter the two nos.");
        int x=Integer.parseInt(in.readLine());
        int n=0;
        int r;
        int t=n;
        int s=0;
        while(n!=0)
        { r=n%10;
          s=s+(r*r*r);
          n=n/10;
        }
        if(s==t)
        { System.out.println("Armstrong no.");}
        else
        { System.out.println("Not a Armstrong no.");}
    }
}
         