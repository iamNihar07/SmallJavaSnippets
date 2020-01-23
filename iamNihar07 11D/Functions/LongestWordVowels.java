package Functions;

import java.io.*;   
public class LongestWordVowels
{
    int count(String x)
    {
        String w="",a="",maxword="";
        int maxlength=0;
        int k=0;
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                a=w;
                w="";
                if(a.length()>maxlength)
                {
                    maxlength=a.length();
                    maxword=a;
                }                
            }
        }
        for(int i=0;i<maxword.length();i++)
        {
            char ch=maxword.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
            ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
            {
                k++;
            }
        }
        return k;
    }

    static void main()throws IOException
    {       
        LongestWordVowels ob=new LongestWordVowels();
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a word.");
        String s = in.readLine()+" ";        
        int k1=ob.count(s);
        System.out.println("No. of vowels = "+k1);
    }
    }