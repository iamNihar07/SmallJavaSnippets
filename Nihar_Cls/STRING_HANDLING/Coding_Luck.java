package STRING_HANDLING;
import java.io.*;
public class Coding_Luck  //luck=47
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a string");
        String s = in.readLine();

        int sum=0;
        String s2="";
        s2=s.toUpperCase();
        int l=s.length();
        int i=0;

        for(i=0;i<l;i++)
        {
            char ch=s2.charAt(i);
            sum=sum+(ch-64);
        }
        System.out.println(s+"="+sum);
    }
}
