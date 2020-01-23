package Board;
import java.io.*;
public class ChangeWord //computer ---> cpmpvtfr
{
   static void main() throws IOException 
   {       
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("Enter a word."); 
        String s=in.readLine().toLowerCase();        
        String w="";
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' )
            {
                int x=ch;
                x++;
                ch=(char)x;
            }
            w=w+ch;
        }
        
        System.out.println(w);
    }
}
        