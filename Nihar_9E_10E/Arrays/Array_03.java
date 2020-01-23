package Arrays;
import java.io.*;
public class Array_03
{
    static void main() throws IOException //displaying words in an array ending with a or A
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String name[]=new String[5];
        
        for(int i=0;i<name.length;i++)
        {
            System.out.println("Enter more "+(5-i)+" names");
            name[i]=in.readLine();
        }
        
        char ch;
        
        System.out.println("The words ending with vowel are : ");
        
        for(int i=0;i<name.length;i++)
        {
            ch=name[i].charAt(name[i].length()-1);
            if(ch=='a'||ch=='A')
            {
                System.out.println(name[i]);
            }
        }
    }
}
            