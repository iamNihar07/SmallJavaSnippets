
import java.io.*;
public class Water_Tax
{ 
   void main() throws IOException
   { InputStreamReader read = new InputStreamReader (System.in);
     BufferedReader in = new BufferedReader (read);
     int a=0;
     System.out.println("Enter the gallons consumed");
     a=Integer.parseInt(in.readLine());
     double b=475/100;
     double c=(b)+((750*(a-45)/100));
     double d=(b)+(c)+((1225*(a-75)/100));
     double e=(b)+(c)+(d)+((1650*(a-125)/100));
     double f=(b)+(c)+(d)+(e)+((2000*(a-200)/100));
     if (a<=45)
     { System.out.println("Tax rate is zero rupees");}
     else if(a>45 && a<=75)
     { System.out.println("The tax rate is "+b);}
     else if (a>75 && a<=125)
     { System.out.println("Tax rate is "+c);}
     else if(a>125 && a<=200)
     { System.out.println("Tax rate is "+d);}
     else if(a>200 && a<=350)
     { System.out.println("Tax rate is "+e);}
     else if(a>350)
     { System.out.println("Tax rate is "+f);}
    }
}
