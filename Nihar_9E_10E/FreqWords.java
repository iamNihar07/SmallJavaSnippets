import java.io.*;
public class FreqWords
{
    void main() throws  IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a sentence.");
        String x=in.readLine()+" ";
        int k=0;
        String w="";

        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch==' ')
            {
                k++;
            }
        }

        String z[]=new String[k];
        int l=0;

        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                z[l]=w;
                w="";
                l++;
            }
        }
        
        int m=0;
        for(int i=0;i<z.length;i++)
        {
            m=0;
            boolean flag=true;
            
            for(int j=0;j<i;j++)
            {
                if(z[i].equals(z[j]))
                {
                    flag=false;
                }
            }
            if(flag==true)
            {
                m=0;
                for(int j=i;j<z.length;j++)
                {
                    if(z[i].equals(z[j]))
                    {
                        m++;
                    }
                }
                System.out.println("Frequency of "+z[i]+" is "+m);
            }
            
        }
    }
}
                
            
        