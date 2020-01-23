import java.io.*;
public class Rectangle
{
    void main() throws IOException
    {  
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int a,b=0;
        System.out.println("1.AREA");
        System.out.println("2.PERIMETER");
        System.out.println("3.DIAGONAL");            
        int ch=Integer.parseInt(in.readLine());
        System.out.println("ENTER THE FIRST NO.");
        a=Integer.parseInt(in.readLine());
        System.out.println("ENTER THE SECOND NO.");
        b=Integer.parseInt(in.readLine());
        switch (ch)
        { 
            case 1:
            int area=a*b;
            System.out.println("Area is "+area);
            break;
            case 2:
            int peri=2*a+2*b;
            System.out.println("Perimeter is "+peri);
            break;
            case 3:
            double diag=Math.sqrt(a*a+b*b);
            System.out.println("Diagonal is "+diag);            
            default:            
            System.out.println("Wrong CHOICE!!");
        }
    }
}
            