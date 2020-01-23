
import java.io.*;
public  class Ten_nos
{
    public static void main() throws IOException //accepting 10 nos and finding the smallest.
    {  
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int smallest=0; int i=0; int n=0;

        while(i!=10)
        {
            System.out.println("Enter the nos from which you want to find the smallest");
            n=Integer.parseInt(in.readLine());
            if(i==0)
            {
                smallest=n;
            }
            else
            {
                if(n<smallest)
                {
                    smallest=n;
                }
            }
            i++;
        } 
        System.out.println("The smallest of the entered nos, is "+smallest);
    }
}

        