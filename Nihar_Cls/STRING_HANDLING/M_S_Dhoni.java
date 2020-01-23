package STRING_HANDLING;
import java.io.*;
public class M_S_Dhoni //mahendra singh dhoni ---> dhoni mahendra singh
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a string");
        String s = in.readLine();

        int sp=0;
        int l=s.length();
        int i=0; 
        String s1="";
        String s2="";
        String s3="";
        

        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                sp++;
                if(sp==2)
                {
                    s1=s.substring(i+1);
                    s2=s.substring(0,i);
                    s3=s1+" "+s2;
                    break;
                }
            }
        }
        System.out.println(s3);
    }
}