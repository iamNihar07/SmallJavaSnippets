

import java.io.*;
public class Discounts
{
    void main ()throws IOException
    {InputStreamReader read = new InputStreamReader (System.in);
     BufferedReader in = new BufferedReader (read);
     int a=0;
     System.out.println("1.LAPTOP");
     System.out.println("2.PRINTER");
     System.out.println("3.DESKTOP");
     int ch=Integer.parseInt(in.readLine());
     System.out.println("Enter the Cost PRICE! ");
     a=Integer.parseInt(in.readLine());
     switch (ch)
        {case 1:
         double x = a-(0.15 *a);
         System.out.println("The Selling Price is "+x);
         break;
         case 2:
         double y = a-(0.1 *a);
         System.out.println("The Selling Price is "+y);
         break;
         case 3:
         double z = a-(0.2*a);
         System.out.println("The Selling Price is "+z);
         break;
         default:
         System.out.println("WRONG CHOICE!!!!");
        }
    }
}



