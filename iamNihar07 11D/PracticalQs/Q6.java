package PracticalQs;
import java.io.*;
public class Q6
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s="";
        int vowel=0,consonent=0;
        String a="",w="",f="";
        String word="";
        while(true)
        {
            System.out.println("Enter the string.");
            s=in.readLine();
            if(s.endsWith("?") || s.endsWith("."))
            {
                break;
            }
            else
            {
                System.out.println("\u000c");
                System.out.println("Sentence should terminate with ? or  . only");
            }
        }
        s=s+" ";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                a=w;
                w=""; 
                word=Character.toUpperCase(a.charAt(0))+ a.substring(1,a.length());
                f=f+" "+word;
            }
        }
        System.out.println(f.trim());
        f=f.trim()+" ";
        System.out.println("Word \t\t Vowels \t\t Consonents");
        for(int i=0;i<f.length();i++)
        {
            char ch=f.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                a=w;
                w=""; 
                vowel=0;
                consonent=0;
                for(int j=0;j<a.length();j++)
                {
                    char ch1=a.charAt(j);
                    if(ch1=='a' || ch1=='e' ||ch1=='i' ||ch1=='o' ||ch1=='u' ||
                    ch1=='A' ||ch1=='E' ||ch1=='I' ||ch1=='O' ||ch1=='U')
                    {
                        vowel++;
                    }
                    else if(Character.isLetter(ch1))
                    {
                        consonent++;
                    }
                }
                System.out.println(a+"\t\t\t"+vowel+"\t\t\t"+consonent);
            }
        }
    }
}

                