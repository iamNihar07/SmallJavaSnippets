package STRING_HANDLING;
import java.io.*;
public class FREQUENCY_OF_a_OR_A
{
    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String");
        String s = in.readLine();
        int k=0;

        for(int i=0; i<s.length(); i++)
        {  
            char ch=s.charAt(i);
            if(ch=='a' || ch=='A')
            { 
                k++;
            }
        }
        System.out.println("Frequency of a or A = "+k);
    }
}

   