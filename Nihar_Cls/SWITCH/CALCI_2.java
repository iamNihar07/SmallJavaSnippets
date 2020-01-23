package SWITCH;
import java.io.*;

public class CALCI_2
{
    static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        int c=0;
        
        System.out.println("1.CUBE 2.CUBOID 3.SPHERE");
        c=Integer.parseInt(in.readLine());
        switch(c)
        {
            case 1:
            System.out.println("ENTER SIDE");
            int s=Integer.parseInt(in.readLine());
            System.out.println("VOL OF CUBE = "+(s*s*s));
            break;
            
            case 2:
            System.out.println("ENTER LENGTH, BREADTH, HEIGTH");
            int l=Integer.parseInt(in.readLine());
            int b=Integer.parseInt(in.readLine());
            int h=Integer.parseInt(in.readLine());
            System.out.println("VOL OF CUBOID = "+(l*b*h));
            break;
            
            case 3:
            System.out.println("ENTER RADIUS");
            float r=Float.parseFloat(in.readLine());
            System.out.println("VOL OF SPHERE ="+(4/3.0)*3.14*(Math.pow(r,3)));
            break;
            
            default:
            System.out.println("ERROR OCCURED AT TERMINAL WINDOW");
            System.out.println("PLEASE CHECK THE PROGRAM");
            break;
        }
      }
}