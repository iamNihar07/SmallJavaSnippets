package Arrays;
import java.io.*;
public class Array_20
{
    static void main() throws IOException //bubble sorting Marks and Names
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int m[]=new int[10];
        String n[]=new String[10];

        for(int i=0;i<m.length;i++)
        {
            System.out.println("Enter the name.");
            n[i]=in.readLine();
            System.out.println("Enter the marks.");
            m[i]=Integer.parseInt(in.readLine());
        }
        int t=0;
        String t1="";
        
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<(m.length-1-i);j++)
            {
                t=m[j];
                m[j]=m[j+1];
                m[j+1]=t;
                
                t1=n[j];
                n[j]=n[j+1];
                n[j+1]=t1;
            }
        }
        
        System.out.println();
        System.out.println("Name "+"\t"+" Marks ");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(n[i]+"\t"+m[i]);
        }
    }
}
