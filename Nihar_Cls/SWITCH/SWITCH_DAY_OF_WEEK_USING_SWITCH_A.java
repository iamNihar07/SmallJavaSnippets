package SWITCH;
import java.io.*;

public class SWITCH_DAY_OF_WEEK_USING_SWITCH_A
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        char d;

        System.out.println("ENTER A ALPHABET FROM A-G CORRESPONDING TO A DAY OF THE WEEK");
        d=in.readLine().charAt(0);

        switch(d)
        {
            case 'a':
            System.out.println("Sunday");
            break;
            case 'b':
            System.out.println("Monday");
            break;
            case 'c':
            System.out.println("Tuesday");
            break;
            case 'd':
            System.out.println("Wednesday");
            break;
            case 'e':
            System.out.println("Thursday");
            break;
            case 'f':
            System.out.println("Friday");
            break;
            case 'g':
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }
    }
}