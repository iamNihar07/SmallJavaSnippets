package Arrays;
import java.io.*;
public class Array_01
{
    static void main() throws IOException //finding the vowel in the array
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a string.");
        String x=in.readLine();
        int i=0;
        char ch[]=new char[x.length()];
        int k=0;

        for(i=0;i<ch.length;i++)
        {
            ch[i]=x.charAt(i);
            if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' ||
            ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
            {
                k++;
            }

        }
        System.out.println("No of vowels in the array = "+k);
    }
}