package SWITCH;
import java.io.*;

public class MALL_ME_SWAGAT
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int f=0;

        System.out.println("WELCOME TO THE  MALL");
        System.out.println("ENTER FLOOR");
        f=Integer.parseInt(in.readLine());

        switch(f)
        {
            case 1:
            System.out.println("DAILY ACCESORIES");
            break;
            
            case 2:
            System.out.println("HOME ACCESORIES");
            break;
            
            case 3:
            System.out.println("KIDS SECTION");
            break;
            
            case 4:
            System.out.println("RESTAURANT");
            break;
            
            case 5:
            System.out.println("THEATRE");
            break;
            
            default:
            System.out.println("YOU MAY HAVE ENTERED THE WRONG MALL AS THIS ONE HAS ONLY 5 FLOORS");
        }
    }
}