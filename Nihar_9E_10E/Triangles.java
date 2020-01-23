import java.io.*;
public class Triangles
{ 
    void main ()throws IOException
    {InputStreamReader read = new InputStreamReader (System.in);
     BufferedReader in = new BufferedReader (read);
     int a,b,c=0;
     System.out.println("Enter the first side");
     a=Integer.parseInt(in.readLine());
     System.out.println("Enter the second side");
     b=Integer.parseInt(in.readLine());
     System.out.println("Enter the third side");
     c=Integer.parseInt(in.readLine());
     if(a==b && b==c)
     { System.out.println("It is a equilateral traingle");}
     else if(a==b && b!=c || b==c && c!=a || c==a && a!=b)
     { System.out.println("It is a isosceles traingle");}
     else if(a!=b && b!=c && c!=a)
     { System.out.println("It is a scalene traingle");}
    }
}
     
        