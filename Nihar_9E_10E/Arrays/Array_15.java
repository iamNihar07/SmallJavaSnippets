package Arrays;
import java.io.*;
public class Array_15
{
    static void main() throws IOException //displaying words in an array starting and ending with a consonant
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        String name[]=new String[10];

        for(int i=0;i<name.length;i++)
        {
            System.out.println((i+1)+" Enter name");
            name[i]=in.readLine();
        }

        char ch1,ch2;
        System.out.println();
        System.out.println("The words starting & ending with consonant are : ");

        for(int i=0;i<name.length;i++)
        {
            String q=name[i];
            boolean flaga=false,flagb=false;
            q=q.toUpperCase();
            ch1=q.charAt(0);
            ch2=q.charAt(q.length()-1);
            if(Character.isLetter(ch1) && Character.isLetter(ch2))
            {
                if(!((ch1=='A') || (ch1=='E') || (ch1=='I') || (ch1=='O') || (ch1=='U')))
                {
                    flaga=true;
                }
                if(!((ch2=='A') || (ch2=='E') || (ch2=='I') || (ch2=='O') || (ch2=='U')))
                {
                    flagb=true;
                }
                if(flaga==true&& flagb==true)
                {
                    System.out.println(name[i]);
                }  
            }
        }
    }
}
