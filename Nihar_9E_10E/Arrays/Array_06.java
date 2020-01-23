package Arrays;
import java.io.*;
public class Array_06
{
    static void main() throws IOException //extracing first aplhabet of the words
    {                                    //in an array and den formin a new word
        InputStreamReader read = new InputStreamReader(System.in); //displayed in 
        BufferedReader in = new BufferedReader(read);       //alphabetical order

        String a[]=new String[5];

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter more "+(5-i)+" words");
            a[i]=in.readLine();
        }

        char ch,ch1;
        String w="",q="";

        for(int i=0;i<a.length;i++)
        {
            ch=a[i].charAt(0);
            w=w+ch;
        }
        w=w.toUpperCase();
        for( int i=65; i<=90; i++)
        {
            for( int j=0; j<w.length(); j++)
            {
                ch1 = w.charAt(j);
                if(ch1==(char)i)
                {
                    q=q+ch1;
                }
            }
        }

        System.out.println("The new word in alphabetical order is "+q);
    }
}

            