package Strings;
import java.io.*;
public class String_013 //for checking vowels.
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter your String.");
        String x = in.readLine();
        int k=0,l=0,m=0,n=0,o=0;
        String s = x.toLowerCase();
        for(int i=0; i<s.length(); i++)
        { 
            char ch = s.charAt(i);
            if(ch == 'a' )
            {
                k++;
            }
            else if(ch== 'e' )
            {
                l++;
            }
            else if(ch== 'i' )
            {
                m++;
            }
            else if(ch== 'o')
            {
                n++;
            }
            else if(ch== 'u')
            {
                o++;
            }
        }
        System.out.println(" No. of Vowel a = "+k);
        System.out.println(" No. of Vowel e = "+l);
        System.out.println(" No. of Vowel i = "+m);
        System.out.println(" No. of Vowel o = "+n);
        System.out.println(" No. of Vowel u = "+o);
    }
}
        
        
            

             