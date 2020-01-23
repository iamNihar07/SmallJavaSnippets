package Arrays;      
import java.io.*;    
public class Array_11
{                   
    static void main()throws IOException 
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        String s = "India is the is the";
        s=s+' ';
        int l= s.length();
        char ch; int c=0,w=0,m=0;
        String s2="";
        boolean flag=false;
        int f=1;

        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                c++;
            }
        }
        w=c+1;

        String ar[]=new String[w];

        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch!=' ')
            {
                s2=s2+ch;
            }
            else
            {
                ar[m]=s2;
                m++;
                s2="";
            }
        }

        for(int i=0;i<w;i++)
        {
            flag=false;
            for(int x=0;x<i;x++)
            {
                if(ar[i].equals(ar[x]))
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                for(int z=0;z<w;z++)
                {
                    if(ar[i].equals(ar[z]))
                    {
                        f++;
                    }
                }
                System.out.println("Frequency of "+ar[i]+" = "+f);
            }
        }
    }
}

           
                
            
