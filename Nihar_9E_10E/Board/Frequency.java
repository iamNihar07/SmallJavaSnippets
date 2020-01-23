package Board;
import java.io.*;
public class Frequency
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter a word.");
        String x=in.readLine().toUpperCase();
        
        
        System.out.println("Letter \t Frequency");
        for(int i=65;i<=90;i++)
        {
            char ch=0;
            int f=0;
            for(int j=1;j<x.length();j++)
            {
                ch=x.charAt(j);
                if(ch==i)
                {
                    f++;
                }
            }
            if(f>0)
            {
                System.out.println((char)i+"\t"+f);
            }
        }
    }
}
                
        
    