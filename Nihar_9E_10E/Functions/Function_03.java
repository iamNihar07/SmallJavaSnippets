package Functions;
import java.io.*;
public class Function_03 //checking for a pallindrome string
{
    static boolean ispallin(String s) 
    {
        String r="";
        for(int i=0;i<s.length();i++)
        {
            r=s.charAt(i)+r;
        }
        if(s.equalsIgnoreCase(r))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static void main()throws IOException 
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter a string");
        String x=in.readLine(); 
        boolean m=ispallin(x);
        if(m==true)
        {
            System.out.println("Pallindrome String");
        }
        else
        {
            System.out.println("Non Pallindrome String");
        }
    }            
}

