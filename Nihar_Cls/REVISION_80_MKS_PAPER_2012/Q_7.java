package REVISION_80_MKS_PAPER_2012;
import java.io.*;
public class Q_7
{   void main()throws IOException
    {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int ch;

        System.out.println("ENTER CHOICE");
        System.out.println("1 for PERFECT NO.");
        System.out.println("2 for Armstrong No.");
        ch=Integer.parseInt(in.readLine());

        switch(ch)
        {
            case 1:
            System.out.println("Enter No.");
            int n1=Integer.parseInt(in.readLine());
            int i=1; int s1=0;
            while(i<n1)
            {
                if(n1%i==0)
                {
                    s1=s1+i;
                }
                i++;
            }
            if(s1==n1)
            {
                System.out.println("PERFECT NO.");
            }
            else
            {
                System.out.println(" NOT PERFECT NO.");
            }
            break;

            case 2:
            System.out.println("Enter No.");
            int n2=Integer.parseInt(in.readLine());
            int m=n2;
            int s2=0,a,cb;

            while(n2!=0)
            {
                a=n2%10;
                cb=a*a*a;
                s2=s2+cb;
                n2=n2/10;
            }
            if(s2==m)
            {
                System.out.println("armstrong no.");
            }
            else
            {
                System.out.println("not an armstrong no.");
            }  
            break;

        }
    }
}
