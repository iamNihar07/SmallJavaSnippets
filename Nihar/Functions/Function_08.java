package Functions;
import java.io.*;
public class Function_08 //Function Overloading
{

    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Function_08 ob=new Function_08();

        System.out.println("Enter the radius of the circle.");
        float r=Float.parseFloat(in.readLine());
        ob.area(r);

        System.out.println("Enter the length of the rect.");
        int l=Integer.parseInt(in.readLine());
        System.out.println("Enter the breadth of the rect.");
        int b=Integer.parseInt(in.readLine());
        ob.area(l,b);

        System.out.println("Enter the side of square");
        int s=Integer.parseInt(in.readLine());
        ob.area(s);

        System.out.println();
        System.out.println("......");
    }

    void area(float r1)
    {
        double area=0.0;
        area=r1*r1*3.14;
        System.out.println(area+" is the area of circle.");
    }

    void area(int l1, int b1)
    {
        int area=0;
        area=l1*b1;
        System.out.println(area+" is the area of the rectangle.");
    }

    void area(int s1)
    {
        int area=0;
        area=s1*s1;
        System.out.println(area+" is the area of the square.");
    }
}
