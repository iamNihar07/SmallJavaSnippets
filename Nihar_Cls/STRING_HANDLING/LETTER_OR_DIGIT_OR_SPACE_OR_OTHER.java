package STRING_HANDLING;
import java.io.*;
public class LETTER_OR_DIGIT_OR_SPACE_OR_OTHER

{    static void main() throws IOException
    { 
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a String");
        String s = in.readLine();

        int i=0;
        char ch;
        int l=s.length(),le=0,di=0,sp=0,sc=0,cle=0,lle=0;

        for(i=0; i<l; i++)
        {  
            ch=s.charAt(i);
            if(Character.isLetter(ch))

            { 
                le++;
                if(Character.isUpperCase(ch))
                {
                    cle++;
                }
                else
                {
                    lle++;
                }
            }    
            else if(Character.isDigit(ch))
            {
                di++;

            }
            else if(Character.isWhitespace(ch))
            {
                sp++;

            }

            else 
            {
                sc++;

            }

        }
        System.out.println("No. of Letters is "+le);
        System.out.println("        No. of Capital Letters is "+cle);
        System.out.println("        No. of Small Letters is "+lle);
        System.out.println("No. of Digits is "+di);
        System.out.println("No. of Spaces is "+sp);
        System.out.println("No. of special Characters"+sc);
    }
}