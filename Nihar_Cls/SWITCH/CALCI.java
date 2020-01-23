package SWITCH;
import java.io.*;

public class CALCI
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        double a,b=0;
        int c=0;
        System.out.println("ENTER 2 NO.S");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        System.out.println("ENTER CHOICE ");
        System.out.println("1.ADD 2.SUBTRACT 3.MULTIPLY 4.DIVIDE");
        c=Integer.parseInt(in.readLine());
        switch(c)
        {
            case 1:
            System.out.println("SUM = "+(a+b));
            break;
            case 2:
            System.out.println("DIFFERENCE = "+(a-b));
            break;
            case 3:
            System.out.println("PRODUCT ="+(a*b));
            break;
            case 4:
            System.out.println("QUOTIENT = "+(a/b));
            break;
            default:
            System.out.println("ERROR OCCURED AT TERMINAL WINDOW");
            System.out.println("PLEASE CHECK THE PROGRAM");
            break;
        }
      }
}