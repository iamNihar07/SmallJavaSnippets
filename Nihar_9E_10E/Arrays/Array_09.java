package Arrays;
import java.io.*;
public class Array_09
{
    static void main() throws IOException //Pallindrome worrds in array
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String a[]=new String[10];
        int i=0;String w="",w1="",w2="";
        char ch;

        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter more "+(10-i)+" names");
            a[i]=in.readLine();
        }
        System.out.println("Pallindrome word in the array - ");      

        

        for(i=0;i<a.length;i++)
        {
            w=a[i];
            for(int j=0;j<w.length();j++)
            {
                ch=w.charAt(j);
                w1=ch+w1;
                w2=w2+ch;
            }
            
            if(w1.equalsIgnoreCase(w2))
            {
                System.out.println(a[i]);
            }
            w="";
            w1="";
            w2="";
        }
    }
}
            