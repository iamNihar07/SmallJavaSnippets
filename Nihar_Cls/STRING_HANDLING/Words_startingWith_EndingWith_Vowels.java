package STRING_HANDLING;
import java.io.*;
public class Words_startingWith_EndingWith_Vowels
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a string");
        String s = in.readLine();
        s=s+" ";
        int l=s.length();
        int c=0;
        String s2="";
        char ch; char ch1; char ch2;
        boolean flag1=false; boolean flag2=false;

        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                s2=s2+ch;
            }
            else
            {
                ch1=s2.charAt(0);
                ch2=s2.charAt(s2.length()-1);
                if(ch1=='A' || ch1=='a' || 
                   ch1=='E' || ch1=='e' || 
                   ch1=='I' || ch1=='i' || 
                   ch1=='O' || ch1=='o' || 
                   ch1=='U' || ch1=='u' )
                {
                    flag1=true;
                }
                if(ch2=='A' || ch2=='a' || 
                   ch2=='E' || ch2=='e' || 
                   ch2=='I' || ch2=='i' || 
                   ch2=='O' || ch2=='o' || 
                   ch2=='U' || ch2=='u' )
                {
                    flag2=true;
                }
                if(flag1==true&&flag2==true)
                {
                    System.out.println(s2);
                    c++;
                }
                s2="";
                flag1=false; 
                flag2=false;
            }
        }
        System.out.println("Total no of words which begin and end with a vowel are "+c);
    }
}

