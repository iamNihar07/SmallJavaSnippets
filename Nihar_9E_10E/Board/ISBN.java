package Board;
import java.io.*;
public class ISBN
{
    static void main() throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        System.out.println("Enter the ISBN code");
        String ISBN=in.readLine();
        if(ISBN.length()==10)
        {
            String a="";
            int sum=0; int dig=0;
            for(int i=0;i<ISBN.length();i++)
            {
                char ch=ISBN.charAt(i);
                a=Character.toString(ch);
                dig=Integer.parseInt(a);               
                sum=sum+(dig*(i+1));
            }
            if(sum%11==0)
            {
                System.out.println("Legal ISBN");
            }
            else
            {
                System.out.println("Illegal ISBN");
            }
        }
        else
        {
            System.out.println("Illegal ISBN");
        }
    }
}
        

        