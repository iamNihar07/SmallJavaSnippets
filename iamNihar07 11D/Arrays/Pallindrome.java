package Arrays;
import java.io.*;
/**
 * Display the freq of a number entered by the user
 */
public class Pallindrome
{
    static void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);        
        String a[]=new String[10];         

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the element at "+(i)+" position");
            a[i]=in.readLine();
        }

        for(int i=0;i<a.length;i++)
        {
            String s=a[i];
            String w="",rw="";
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(ch!=' ')
                {
                    w=w+ch;
                    rw=ch+rw;
                }
                else
                {
                    if(w.equalsIgnoreCase(rw) && w.length()>1)
                    {
                        System.out.println(a[i]);
                    }
                    w="";
                    rw="";
                }
            }
        }
    }
}