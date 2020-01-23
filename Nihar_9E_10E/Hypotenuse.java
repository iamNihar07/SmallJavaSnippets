import java.io.*;
public class Hypotenuse
{ 
    void main ()throws IOException
    {InputStreamReader read = new InputStreamReader (System.in);
     BufferedReader in = new BufferedReader (read);
     double b,h=0;
     System.out.println("Enter the base");
     b=Integer.parseInt(in.readLine());
     System.out.println("Enter the height");
     h=Integer.parseInt(in.readLine());
     double a = (b*b)+(h*h);
     System.out.println(Math.sqrt(a));
     }
}