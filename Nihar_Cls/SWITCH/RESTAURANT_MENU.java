package SWITCH;
import java.io.*;

public class RESTAURANT_MENU
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int c;

        System.out.println("ENTER CHOICE");
        System.out.println("1.VEG");
        System.out.println("2.NON VEG");
        System.out.println("1.COLD DRINKS");
        System.out.println("1.ICE CREAM");
        c=Integer.parseInt(in.readLine());

        switch(c)
        {
            case 1:
            System.out.println("             PANEER TIKKA");
            System.out.println("            VEG KALHAPURI");
            System.out.println("              DUM ALOO");
            break;
            case 2:
            System.out.println("            CHICKEN BUTTER MASALA");
            System.out.println("                 PRAWN TIKKA");
            System.out.println("                  FISH FRY");
            break;
            case 3:
            System.out.println("             PEPSI");
            System.out.println("            MIRINDA");
            System.out.println("              RIO");
            break;
            case 4:
            System.out.println("            CHOCO-CHIP");
            System.out.println("             BROWNIE");
            System.out.println("             VANILLA");
            break;
           
            default:
            System.out.println("            Wrong Choice");
            break;
            }
            System.out.println("NOTE - EITHER ROTI OR RICE IS COMPULSARY");
    }
}
