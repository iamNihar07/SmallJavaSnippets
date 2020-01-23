
import java.io.*;
public class Menu
{
    void main() throws IOException
    {  
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        int a,b=0;
        System.out.println("1.ADD");
        System.out.println("2.SUBTRACT");
        System.out.println("3.MULTIPLY");
        System.out.println("4.DIVIDE");
        System.out.println("5.REMAINDER");      
        int ch=Integer.parseInt(in.readLine());
        System.out.println("ENTER THE FIRST NO.");
        a=Integer.parseInt(in.readLine());
        System.out.println("ENTER THE SECOND NO.");
        b=Integer.parseInt(in.readLine());
        switch (ch)
        { 
            case 1:
            int s=a+b;
            System.out.println("Sum is "+s);
            break;
            case 2:
            int d=a-b;
            System.out.println("Difference is "+d);
            break;
            case 3:
            int p=a*b;
            System.out.println("Product is "+p);
            break;
            case 4:
            int q=a/b;
            System.out.println("Quotient is "+q);
            break;
            case 5:
            int r=a%b;
            System.out.println("Remainder is "+r);
            break;
            default:            
            System.out.println("Wrong CHOICE!!");
        }
    }
}
            