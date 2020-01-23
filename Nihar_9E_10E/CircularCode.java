
import java.io.*;
public class CircularCode
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    String txt;

    void input()throws IOException
    {
        System.out.println("Enter a number");
        txt=in.readLine();
    }

    char convert(int i)
    {
        char c=txt.charAt(i);
        return c;
    }

    void code()
    {
        String w="";
        
        for(int i=0;i<txt.length();i++)
        {
            char ch=convert(i);
            if(ch=='Z' || ch=='z')
            {
                int x=ch-25;
                ch=(char)x;
            }
            else
            {
                int x=ch;
                x++;
                ch=(char)x;
            }
            w=w+ch;
        }
        System.out.println("New String- "+w);
    }
    
    static void main() throws IOException
    {
        CircularCode ob=new CircularCode();
        ob.input();
        ob.code();
    }
}
    
    
    
