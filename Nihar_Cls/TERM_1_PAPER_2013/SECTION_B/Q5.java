package TERM_1_PAPER_2013.SECTION_B;
import java.io.*;
public class Q5
{
    void main() throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int n=0,m=0,ch=0,r=0,nn=0,sq=0;
        
        System.out.println("ENTER NO. TO BE CHECKED");
        n=Integer.parseInt(in.readLine());
        
        sq=(int)(Math.pow(n,2));
        m=n;

        System.out.println("Enter choice");
        System.out.println("1. PALINDROME");
        System.out.println("2. NEON");
        ch=Integer.parseInt(in.readLine());

        switch(ch)
        {
            case 1:
            while(m!=0)
            {
                r=m%10;
                nn=(nn*10)+r;
                m=m/10;
            }
            if (nn==n)
            {
                System.out.println("PALINDROME NO.");
            }
            else
            {
                System.out.println("NOT PALINDROME NO.");
            }
           
            break;
            
            case 2:
            while(sq!=0)
            {
                r=m%10;
                nn=nn+r;
                m=m/10;
            }
            
            if (nn==n)
            {
                System.out.println("NEON NO.");
            }
            else
            {
                System.out.println("NOT NEON NO.");
            }
            break;
        }
        
    }
}
