import java.io.*;
public class Reversing_digits
{ 
    public static void main ()throws IOException //reversing digits
    {   InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        System.out.println("Enter the No to be reversed.");
        int x=Integer.parseInt(in.readLine());
        int nn=0; int r=0;
        while(x!=0)
        { r=x%10;
          nn = nn*10+r;
          x=x/10;
        }
        System.out.println("Reversed no. is "+nn);
    }
}