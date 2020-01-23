package Functions;
import java.io.*;
public class Function_09//Function with Menu 
{

    static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Function_09 ob=new Function_09();
        int conti; int out=0;
        do
        {
            conti=0;
            System.out.println("\u000c");
            System.out.println("\t\t\t"+"1.Area of Circle.");
            System.out.println("\t\t\t"+"2.Area of Rect.");
            System.out.println("\t\t\t"+"3.Area of Square.");
            System.out.println("\t\t\t"+"4.Exit.");
            System.out.println("Enter choice.");
            int ch=Integer.parseInt(in.readLine());

            switch(ch)
            {
                case 1:           

                System.out.println("Enter the radius of the circle.");
                float r=Float.parseFloat(in.readLine());
                ob.area(r);
                break;

                case 2:
                System.out.println("Enter the length of the rect.");
                int l=Integer.parseInt(in.readLine());
                System.out.println("Enter the breadth of the rect.");
                int b=Integer.parseInt(in.readLine());
                ob.area(l,b);
                break;

                case 3:
                System.out.println("Enter the side of square");
                int s=Integer.parseInt(in.readLine());
                ob.area(s);
                break;

                case 4:
                out=1;
                conti=0;
                break;

                default:
                System.out.println("Wrong choice.");
            }
            
            if(out==0)
            {
                System.out.println("Press 1 to continue.");
                conti=Integer.parseInt(in.readLine());
            }
            else
            {
                System.out.println("Thank You.");
            }
            
        }
        while(conti==1);
        
        System.out.println("....");
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
