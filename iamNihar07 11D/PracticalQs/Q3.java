package PracticalQs;
import java.io.*;

public class Q3 //circular code
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        int shift=0;
        do
        {
            System.out.println("Enter the shift value");
            shift=Integer.parseInt(in.readLine());
            if(shift>0 && shift <=26)
            {
                break;
            }
            else
            {
                System.out.println("Plz enter a valid shift.");
            }
        }while(true);

        System.out.println("Enter the string");
        String s=in.readLine();
        String code="";
        int x=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                x=ch+shift;
                if(x>90)
                {
                    x=65+(x-91);
                }
                code=code+(char)x;
            }

            else
            {
                code=code+ch;
            }
        }
        System.out.println("The Incryptred String is "+code);
    }   

}

