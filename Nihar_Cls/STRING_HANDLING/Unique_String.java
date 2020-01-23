
package STRING_HANDLING;
import java.io.*;

public class Unique_String
{
    static void main()throws IOException
    { 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a string.");
        String s=(in.readLine()).toUpperCase();;
        char c;
        int n=0;
        boolean flag=false;

        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                c=s.charAt(j);
                if(c==i)
                {
                    n++;
                }
            }
            if(n>1)
            {
                flag=true;
            }
            n=0;
        }
        if(flag==false)
        {
            System.out.println("Unique Word "+s);
        }
        else
        {
            System.out.println("NOt unique word "+s);
        }
    }
}

               

        