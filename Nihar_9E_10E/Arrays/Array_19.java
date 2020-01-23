package Arrays;
import java.io.*;
public class Array_19
{
    static void main() throws IOException //checking if first letter of ur name
                                          //is present in a stringusing Arrays
    {
        InputStreamReader read= new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String.");
        String s=in.readLine();
        char ch; char ch1;
        char m[]=new char[s.length()]; int k=0;

        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            m[i]=ch;
        }
        
        System.out.println();
        System.out.println("Enter the first letter of your name.");
        ch1=(in.readLine()).charAt(0);
        
        for(int i=0;i<m.length;i++)
        {
            if(m[i]==ch1)
            {
                k=1;
                break;
            }
        }
        
        if(k==1)
        {
            System.out.println("Alphabet FOund");
        }
        else
        {
            System.out.println("Alphabet not found");
        }
    }
}
        