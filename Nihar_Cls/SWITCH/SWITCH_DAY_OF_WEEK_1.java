package SWITCH;
import java.io.*;

public class SWITCH_DAY_OF_WEEK_1
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int d;

        System.out.println("ENTER NO. OF DAY OF WEEK");
        d=Integer.parseInt(in.readLine());

        switch(d)
        {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }
    }
}