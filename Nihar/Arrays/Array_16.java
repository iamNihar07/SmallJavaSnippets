package Arrays;
import java.io.*;
public class Array_16
{
    static void main() throws IOException //sorting the string in descending order
    {
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);

        System.out.println("Enter a string.");
        String s=in.readLine();
        int l=s.length();

        char ch[]=new char[l]; char ch1; int j=0; char temp;int min=0;
        for(int i=0;i<l;i++)
        {
            ch1=s.charAt(i);
            ch[i]=ch1;
        }

        for(int i=0;i<l-1;i++)
        {
            min=i;

            for(j=i+1;j<l;j++)
            {
                if(ch[min]<ch[j])
                {
                    min=j;
                }
            }
            temp=ch[i];
            ch[i]=ch[min];
            ch[min]=temp;
        }
        System.out.println();
        String q="";
        for(int i=0;i<l;i++)
        {
            q=q+ch[i];
        }
        System.out.println("The string in reversed order is "+q);
    }
}

