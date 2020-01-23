package SWITCH;
import java.io.*;

public class AREA
{
    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int c, l, b, s, r = 0;
        double a=0;
        System.out.println("Enter Choice");
        System.out.println("1 ----> SQUARE");
        System.out.println("2 ----> RECTANGLE");
        System.out.println("3 ----> CIRCLE");
        c=Integer.parseInt(in.readLine());

        switch(c)
        {
            case 1:
            System.out.println("Enter Length & Breadth");
            l=Integer.parseInt(in.readLine());
            b=Integer.parseInt(in.readLine());
            a=l*b;
            System.out.println("Area ="+a);
            break;
            case 2:
            System.out.println("Enter side");
            s=Integer.parseInt(in.readLine());
            a=s*s;
            System.out.println("area = "+a);
            break;
            case 3:
            System.out.println("Enter radius");
            r=Integer.parseInt(in.readLine());
            a=3.14*r*r;
            System.out.println("area = "+a);
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }
    }
}