package Arrays;
import java.io.*;

/**
 * Sort marks and names using seq sort
 */
public class MarksNamesSeq
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);   
        String name[]=new String[10];
        int m[]=new int[10];        
        String temp="";
        int t=0;
        for(int i=0;i<m.length;i++)
        {
            System.out.println("Enter names");
            name[i]=(in.readLine());
            System.out.println("Enter marks");
            m[i]=Integer.parseInt(in.readLine());
        }
        
        for(int i=0;i<m.length;i++)
        {  
            for(int j=i+1;j<m.length;j++)
            {
                if(name[i].compareToIgnoreCase(name[j])>0)
                {
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                    
                    t=m[i];
                    m[i]=m[j];
                    m[j]=t;
                }
            }
        }
        
        System.out.println("Name /t Marks");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(name[i]+"/t"+m[i]);
        }
    }
}