package STRING_HANDLING;
import java.io.*;
public class NO_OF_VOWELS

{    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String");
        String s = in.readLine();
        
        int i=0;
        char ch;
        int l=s.length();
        int k=0;
                
        for(i=0; i<l; i++)
        {  
            ch=s.charAt(i);
            if(ch=='a' || ch=='A' ||
               ch=='e' || ch=='E' ||
               ch=='i' || ch=='I' ||
               ch=='o' || ch=='O' ||
               ch=='u' || ch=='U' )
               
            { 
                k++;
            }                
        }
        System.out.println("No of Vowels = "+k);
    }
}

   