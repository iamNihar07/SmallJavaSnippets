package DO_WHILE;

import java.io.*;
public class do_hotel
{
    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);

        int ch=0,cont=0,veg=0,nveg=0,dess=0;

        System.out.println("      *****HOTEL JUST EAT*****        ");
        System.out.println("        WELCOME TO OUR HOTEL        ");
        System.out.println("");
        System.out.println("");

        do
        {

            System.out.println("Press 1 for VEG");
            System.out.println("      2 for NON VEG");
            System.out.println("      3 for DESSERTS AND BEVERAGES");

            System.out.println("enter the choice number");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:
                System.out.println("PLEASE CHOOSE:-"); 
                System.out.println("");
                System.out.println("PANEER TIKKA MASALA(1)");
                System.out.println("STAR FRIED RICE(2)");
                System.out.println("PAV BHAJI(3)");
                veg=Integer.parseInt(in.readLine());
                break;

                case 2:
                System.out.println("PLEASE CHOOSE:-");
                System.out.println("");
                System.out.println("CHICKEN TIKKA MASALA(1)");
                System.out.println("FISH FINGERS(2)");
                System.out.println("OMLETTE(3)");
                nveg=Integer.parseInt(in.readLine());
                break;

                case 3:
                System.out.println("PLEASE CHOOSE:-");
                System.out.println("");
                System.out.println("PEPSI(1)");
                System.out.println("SIZZLING BROWNIE(2)");
                System.out.println("CHOCO-CHIP ICE CREAM(3)");
                dess=Integer.parseInt(in.readLine());
                break;

                default:
                System.out.println("wrong choice");
            }
            System.out.println("DO YOU WANT ANYTHING ELSE???");
            System.out.println("IF YES, PRESS 1 & IF NO, PRESS ANYTHING ELSE");
            cont=Integer.parseInt(in.readLine());    

        }
        while(cont==1);
        System.out.println("PS-ADD RS.15 EXTRA FOR EXTRA CHEESE OR BUTTER & RS.50 FOR EXTRA ONIONS");	
    }
}
